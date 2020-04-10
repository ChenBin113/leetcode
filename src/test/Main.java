package test;

// 本题为考试单行多行输入输出规范示例，无需提交，不计分。

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hit;
        int time;

        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();

            hit = in.nextInt();
            time = in.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            int ret = killMonster(hit, time, arr);
            System.out.println(ret);
        }
    }

    private static int killMonster(int hit, int time, int[] arr) {
        if (arr == null || arr.length == 0 || time <= 0) return 0;
        Arrays.sort(arr);
        int i;
        for (i = 0; i < arr.length; i++) {
            time--;

            arr[i] -= hit;

            if (arr[i] > 0) {
                i--;
            }

            if (time == 0) break;
        }
        return i + 1;
    }
}
