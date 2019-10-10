package testdemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @date 2019/10/10 15:52
 */
public class ArraysTest01 {
    public static void main(String[] args) {
        int[] array1 = {2, 5, 1, 9, 4, 6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));


        Integer[] array2 = {2, 5, 1, 9, 4, 6};
        Arrays.sort(array2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //升序
                //return o1 - o2;
                //降序
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(array2));

        int[][] array3 = {{1, 3}, {2, 5}, {1, 2}, {3, 4}, {5, 7}};
        //升序排序，更加彻底
        Arrays.sort(array3, Comparator.comparingInt(o -> o[1]));
        //output:
        //[1, 2]
        //[1, 3]
        //[3, 4]
        //[2, 5]
        //[5, 7]

        //升序排序
        //Arrays.sort(array3, Comparator.comparingInt(o -> o[0]));
        //output:
        //[1, 3]
        //[1, 2]
        //[3, 4]
        //[2, 5]
        //[5, 7]

        //Arrays.sort(array3, new Comparator<int[]>() {
        //    @Override
        //    public int compare(int[] o1, int[] o2) {
        //        return o1[0] - o2[0];
        //    }
        //});
        //output:
        //[1, 3]
        //[1, 2]
        //[3, 4]
        //[2, 5]
        //[5, 7]

        for (int[] a : array3) {
            System.out.println(Arrays.toString(a));
        }
    }
}
