package testdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int number = 0;
        for (int i = 0; i < 5; i++) {
            number = i;
            list.add(0, number);
        }
        System.out.println(list);
    }
}
