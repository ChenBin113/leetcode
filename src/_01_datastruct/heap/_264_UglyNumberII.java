package _01_datastruct.heap;

import java.util.PriorityQueue;

public class _264_UglyNumberII {
    /**
     * 用到最小堆的特性
     *
     * @param n
     * @return
     */
    public int nthUglyNumber1(int n) {
        int[] arr = new int[]{2, 3, 5};
        //防止越界
        PriorityQueue<Long> heap = new PriorityQueue<>();
        long[] res = new long[n];
        res[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if (!heap.contains((long) res[i] * arr[j])) {
                    heap.offer((long) res[i] * arr[j]);
                }
            }
            if (i + 1 < n) {
                res[i + 1] = heap.poll();
            }
        }
        return (int) res[n - 1];
    }

    /**
     * 三指针，效率提高很多
     *
     * @param n
     * @return
     */
    public int nthUglyNumber2(int n) {
        int[] arr = new int[n];

        int index2 = 0;
        int index3 = 0;
        int index5 = 0;

        int tmp = 1;
        arr[0] = 1;

        int value2 = 0;
        int value3 = 0;
        int value5 = 0;
        int cnt = 1;
        while (cnt < n) {
            value2 = arr[index2] * 2;
            value3 = arr[index3] * 3;
            value5 = arr[index5] * 5;
            tmp = Math.min(value2, Math.min(value3, value5));
            arr[cnt++] = tmp;
            if (tmp == value2) {
                index2++;
            }
            if (tmp == value3) {
                index3++;
            }
            if (tmp == value5) {
                index5++;
            }
        }
        return arr[n - 1];
    }
}
