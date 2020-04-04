package _01_datastruct._05_hashtable;

import java.util.*;

public class _049_GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList();
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            //排序工作：String -> char[] -> String
            char[] ca = str.toCharArray();
            Arrays.sort(ca);
            //String s = ca.toString(); //这个是不通过的，原因是，toString() 方法的误用
            String s = String.valueOf(ca);//这个方法才是转成 String 字符串

            //检查 s 是否在 key 中，不是则添加
            if (!map.containsKey(s)) map.put(s, new ArrayList<>());
            map.get(s).add(str);
        }
        return new ArrayList(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(strs);
    }
}
