package _02_algorithm._02_dp;

import java.util.HashMap;
import java.util.HashSet;

public class _005_LongestSubstringWithoutRepeatingCharacters {
    /**
     * a b c d e a b c d e f a
     * 0 1 2 3 4 5 6 7 8 9 0 1
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                //得到重复字母的上一次出现位置，加1，j指向新的字母
                //j是指针，不重复的起点
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            //res保存最大的结果
            res = Math.max(res, i - j + 1);
        }
        return res;
    }

    public int lengthOfLongestSubstring2(String s) {
        //a b c d a b c d e
        //1
        if (s == null || s.length() == 0) return 0;
        HashSet<Character> set = new HashSet<>();
        int res = 0;
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                //找到第一次出现的
                set.remove(s.charAt(j++));
                //需要回退一格，将删除的元素再添加进来
                i--;
            } else {
                //没有元素，添加
                set.add(s.charAt(i));
                res = Math.max(res, set.size());
            }
        }
        return res;
    }

}
