package _01_datastruct.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _187_RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() <= 10) return res;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() - 9; i++) {
            //注意 substring 的边界，左包括，右不包括，以及 i 的范围
            String temp = s.substring(i, i + 10);
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
                //去重操作，当 >2 的时候就不再添加
                if (map.get(temp) == 2) {
                    res.add(temp);
                }
            } else {
                map.put(temp, 1);
            }
        }
        return res;
    }
}
