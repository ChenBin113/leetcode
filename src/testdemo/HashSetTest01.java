package testdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @date 2019/10/11 17:03
 */
public class HashSetTest01 {
    public static void main(String[] args) {
        HashSet<List<Integer>> set = new HashSet<>();
        List<Integer> lst1 = new ArrayList<>();
        lst1.add(1);
        List<Integer> lst2 = new ArrayList<>();
        lst2.add(1);
        List<Integer> lst3 = new ArrayList<>();
        lst3.add(2);

        set.add(lst1);
        boolean flag = set.contains(lst2);
        System.out.println(flag);
        set.add(lst3);
        System.out.println(set);
    }
}
