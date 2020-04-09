package _02_algorithm._01_doublepointer;

public class _633_JudgeSquareSum {
    public boolean judgeSquareSum(int c) {
        if (c < 0) return false;

        int begin = 0;
        int end = (int)Math.sqrt(c);

        while (begin <= end) {
            int sum = begin * begin + end * end;
            if (sum == c) {
                return true;
            } else if (sum < c) {
                begin++;
            } else {
                end--;
            }
        }

        return false;
    }
}
