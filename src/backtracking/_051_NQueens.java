package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @date 2019/10/12 10:18
 */
public class _051_NQueens {

    //没得出结果，先放着
    /*public static List<List<String>> solveNQueens(int n) {
        //result 存放总结果
        List<List<StringBuilder>> sb_result = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        //sb_location 存放单次结果
        List<StringBuilder> sb_location = new ArrayList<>();
        List<String> location = new ArrayList<>();
        //mark 操作过程
        int[][] mark = new int[n][n];

        //初始化 sb_location
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(n);
            for (int j = 0; j < n; j++) {
                sb.append(".");
            }
            sb_location.add(sb);
        }
        generate(0, n, sb_result, sb_location, mark);

        for (List<StringBuilder> lst_sb : sb_result) {
            for (StringBuilder sb : lst_sb) {
                String s = sb.toString();
                location.add(s);
            }
            result.add(location);
        }
        return result;
    }

    public static void generate(int k, int n, List<List<StringBuilder>> sb_result, List<StringBuilder> sb_location, int[][] mark) {
        //k 是第 k 行的皇后
        if (k == n) {
            ArrayList<StringBuilder> temp = new ArrayList<>(sb_location);
            sb_result.add(temp);
            return;
        }
        //i 是列数
        for (int i = 0; i < n; i++) {
            if (mark[k][i] == 0) {
                //不可以直接这样赋值，非基本类型传递的是引用
                //int[][] temp_mark = mark;
                int[][] temp_mark = new int[mark.length][mark[0].length];
                for (int temp_i = 0; temp_i < mark.length; temp_i++) {
                    for (int temp_j = 0; temp_j < mark[0].length; temp_j++) {
                        temp_mark[temp_i][temp_j] = mark[temp_i][temp_j];
                    }
                }
                sb_location.get(k).setCharAt(i, 'Q');
                putDownTheQueen(k, i, mark);
                generate(k + 1, n, sb_result, sb_location, mark);
                mark = temp_mark;
                sb_location.get(k).setCharAt(i, '.');
            }
        }
    }

    public static void putDownTheQueen(int x, int y, int[][] mark) {
        int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};
        mark[x][y] = 1;
        for (int i = 1; i < mark.length; i++) {
            for (int j = 0; j < 8; j++) {
                int new_x = i * dx[j] + x;
                int new_y = i * dy[j] + y;
                if (new_x >= 0 && new_x < mark.length && new_y >= 0 && new_y < mark.length) {
                    mark[new_x][new_y] = 1;
                }
            }
        }
    }*/

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        if (n <= 0) return res;
        helper(res, new int[n], 0);
        return res;
    }

    //queens[]: [1,2,0] 代表第一行第二列，第二行第三列，第三行第一列有 queen
    //pos 指行
    public void helper(List<List<String>> res, int[] queens, int pos) {
        if (pos == queens.length) {
            addSolution(res, queens);
            return;
        }
        for (int i = 0; i < queens.length; i++) {
            queens[pos] = i;
            if (isValid(queens, pos)) {
                helper(res, queens, pos + 1);
            }
        }
    }

    public void addSolution(List<List<String>> res, int[] queens) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < queens.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < queens.length; j++) {
                if (queens[i] == j) {
                    sb.append('Q');
                } else {
                    sb.append('.');
                }
            }
            list.add(sb.toString());
        }
        res.add(list);
    }

    public boolean isValid(int[] queens, int pos) {
        for (int i = 0; i < pos; i++) {
            if (queens[i] == queens[pos]) { //同一列
                return false;
            } else if (Math.abs(queens[pos] - queens[i]) == Math.abs(pos - i)) { //是否在对角线上
                return false;
            }
        }
        return true;
    }
}
