package _01_datastruct._05_hashtable;

public class _409_LongestPalindrome {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) return 0;
        int maxLength = 0;
        int flag = 0;
        char[] map = new char[128];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)]++;
        }
        for (int i = 0; i < map.length; i++) {
            if (map[i] % 2 == 0) {
                maxLength += map[i];
            } else {
                maxLength += map[i] - 1;
                flag = 1;
            }
        }
        return maxLength + flag;
    }
}
