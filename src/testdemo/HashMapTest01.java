package testdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest01 {
    public static void main(String[] args) {
        Map<Character, Integer> map1 = new HashMap<>();
        //更新
        map1.put('a', 0);
        map1.put('a', 1);
        System.out.println(map1);


        Map<Character, ArrayList<Integer>> map2 = new HashMap<>();
        //增加
        map2.put('a', new ArrayList<>());
        map2.get('a').add(5);
        map2.get('a').add(10);
        map2.get('a').add(1);
        System.out.println(map2);
    }
}
