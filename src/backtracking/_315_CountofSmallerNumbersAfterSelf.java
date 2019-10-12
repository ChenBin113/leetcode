package backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @date 2019/10/12 18:13
 */
public class _315_CountofSmallerNumbersAfterSelf {
    //暴力破解
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) count++;
            }
            res.add(count);
        }
        return res;
    }

    //归并排序
    /*public void mergeSortTwoArr(List<Integer> arr1, List<Integer> arr2, List<Integer> arr) {
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                arr.add(arr1.get(i));
                i++;
            } else {
                arr.add(arr2.get(j));
                j++;
            }
        }
        for (; i < arr1.size(); i++) {
            arr.add(arr1.get(i));
        }
        for (; j < arr2.size(); j++) {
            arr.add(arr2.get(j));
        }
    }

    public void mergeSort(List<Integer> arr) {
        if (arr.size() < 2) return;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        int mid = arr.size() / 2;
        for (int i = 0; i < mid; i++) {
            arr1.add(arr.get(i));
        }
        for (int i = mid; i < arr.size(); i++) {
            arr2.add(arr.get(i));
        }
        mergeSort(arr1);
        mergeSort(arr2);
        arr.clear();
        mergeSortTwoArr(arr1, arr2, arr);
    }*/
    
}
