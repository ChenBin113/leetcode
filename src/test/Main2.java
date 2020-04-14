package test;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int[][] array = new int[x][2];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = reader.nextInt();
            }
        }
        System.out.println(maxEnvelopes(array));
    }

    public static int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null || envelopes.length == 0) return 0;
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0];
            }
        });
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{envelopes[0][0], envelopes[0][1]});
        for (int i = 1; i < envelopes.length; i++) {
            int[] peek = queue.peek();
            if (peek[0] < envelopes[i][0] && peek[1] < envelopes[i][1]) {
                queue.poll();
            }
            queue.add(new int[]{envelopes[i][0], envelopes[i][1]});
        }
        return queue.size();
    }

}

