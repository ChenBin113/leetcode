package testdemo;

import java.util.ArrayList;
import java.util.List;

public class IntArrayTest01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //System.out.println(arr[-1]); //IndexOut
        //传值操作，没有传引用
        for (int i : arr) {
            helper(i);
            System.out.println(i);
        }
        List<Integer> list = new ArrayList<>();

    }

    public static void helper(int number) {
        number = 99;
    }
}
