package hashtable;

import java.util.HashMap;
import java.util.Map;

public class _290_WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" ");
        if (pattern.length() != s.length) return false;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            //1. 没有映射时执行
            if (!map.containsKey(pattern.charAt(i))) {
                //2. 没有映射却找到了 value，说明已经之前使用过别的字符存入了 str
                if (map.containsValue(s[i])) return false;
                //3. 构建映射
                map.put(pattern.charAt(i), s[i]);
            } else {
                //注意字符串的对比需要使用 equals 方法
                //if (map.get(pattern.charAt(i)) != s[i]) return false;
                if (!map.get(pattern.charAt(i)).equals(s[i])) return false;
            }
        }
        return true;
    }
}
