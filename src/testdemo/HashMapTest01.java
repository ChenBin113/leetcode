package testdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest01 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('a', 1);
        System.out.println(map);
    }
}
