package _01_datastruct._05_hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _003_LongestSubstringWithoutRepeatingCharacters {

    //使用 双指针 set 判断是否已经存在字符
    public static int lengthOfLongestSubstring1(String s) {
        if (s == null || s.length() == 0) return 0;
        int res = 0;
        int begin = 0;
        int i = 0;
        Set<Character> set = new HashSet<>();
        //控制边界
        while (begin < s.length() && i < s.length()) {
            //如果字符不重复，将字符添加到集合中，i 指针向后移动，更新 res，注意 i - begin 的 i 已经加 1
            //如果字符重复，集合移除 begin 指针的字符，begin 指针向后移动，继续判断集合中是否存在字符，直到 begin 指针移动到重复字符后一位或超出边界
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                i++;
                res = Math.max(i - begin, res);
            } else {
                set.remove(s.charAt(begin));
                begin++;
            }
        }
        return res;
    }

    public static int lengthOfLongestSubstring2(String s) {
        if (s == null || s.length() == 0) return 0;
        int res = 0;
        int begin = 0;
        //建立字符和索引的 map
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            //判断 map 是否存在字符，是则更新 begin
            if (map.containsKey(s.charAt(i))) {
                begin = Math.max(begin, map.get(s.charAt(i)) + 1);
            }
            //更新字符的索引值
            map.put(s.charAt(i), i);
            //更新 res
            res = Math.max(res, i - begin + 1);
        }
        return res;
    }

    //视频中算法的 Java 实现
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        int res = 0;
        int begin = 0;
        int[] charMap = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charMap[c] += 1;
            if (charMap[c] > 1) {
                while (charMap[c] > 1) {
                    charMap[s.charAt(begin)]--;
                    begin++;
                }
            }
            res = Math.max(res, i - begin + 1);
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
