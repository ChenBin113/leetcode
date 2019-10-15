package game;

import java.util.ArrayList;
import java.util.List;

public class _5079_ThreeArrays {
    /**
     * 给出三个均为 严格递增排列 的整数数组 arr1，arr2 和 arr3。
     * 返回一个由 仅 在这三个数组中 同时出现 的整数所构成的有序数组。
     *
     * 输入: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
     * 输出: [1,5]
     * 解释: 只有 1 和 5 同时在这三个数组中出现.
     *
     * @param arr1
     * @param arr2
     * @param arr3
     * @return
     */
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> res = new ArrayList<>();
        if (arr1 == null || arr2 == null || arr3 == null) return res;
        int i=0, j=0, k=0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                res.add(arr1[i]);
                i++;
                j++;
                k++;
            } else {
                int temp = Math.min(Math.min(arr1[i], arr2[j]), arr3[k]);
                if (temp == arr1[i]) {
                    i++;
                }
                if (temp == arr2[j]) {
                    j++;
                }
                if (temp == arr3[k]) {
                    k++;
                }
            }
        }
        return res;
    }
}
