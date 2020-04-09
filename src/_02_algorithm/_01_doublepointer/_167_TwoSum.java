package _02_algorithm._01_doublepointer;

public class _167_TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) return null;

        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return null;
    }
}
