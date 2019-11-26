package array;

public class _867_TransposeMatrix {
    public int[][] transpose(int[][] A) {
        int raw_row = A.length;
        int raw_col = A[0].length;
        int[][] res = new int[raw_col][raw_row];
        for (int i = 0; i < raw_row; i++) {
            for (int j = 0; j < raw_col; j++) {
                res[j][i] = A[i][j];
            }
        }
        return res;
    }
}