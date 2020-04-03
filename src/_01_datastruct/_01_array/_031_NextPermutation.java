package _01_datastruct._01_array;

public class _031_NextPermutation {
    public static void nextPermutation(int[] nums) {
        //边界
        if (nums == null || nums.length == 0) return;

        //标志，该数坐标右侧数组为降序排列
        int firstSmall = -1;

        //找 firstSmall
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                firstSmall = i;
                break;
            }
        }

        //如果为 -1，说明全数组降序排列，则使用 reverse 方法进行升序
        if (firstSmall == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        //标志，确定在子数组中比 firstSmall 大一点的数的坐标
        int firstLarge = -1;
        for (int j = nums.length - 1; j > firstSmall; j--) {
            if (nums[j] > nums[firstSmall]) {
                firstLarge = j;
                break;
            }
        }

        //曾怀疑过 firstSmall firstLarge 是否会因为进入 swap 函数而改变，后明白，此处不是引用类型，因此不改变
        swap(nums, firstSmall, firstLarge);
        reverse(nums, firstSmall + 1, nums.length - 1);
        return;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i++] = nums[j];
        nums[j--] = temp;
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,9,5,4,1};
        _031_NextPermutation.nextPermutation(nums);
    }
}
