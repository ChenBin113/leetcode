package game;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _5223_QueensThatCanAttacktheKing {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> res = new ArrayList<>();
        Set<int[]> set = new HashSet<>();
        putDownTheKing(king, set);
        int size = set.size();
        for (int[] queen : queens) {
            if (set.contains(queen)) {
                size--;
            }
        }
        return res;
    }

    public void putDownTheKing(int[] king, Set<int[]> set) {
        int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};
        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int new_x = i * dx[j] + king[0];
                int new_y = i * dy[j] + king[1];
                if (new_x >= 0 && new_x < 8 && new_y >= 0 && new_y < 8) {
                    set.add(new int[]{new_x, new_y});
                }
            }
        }
    }
}
