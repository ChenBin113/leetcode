package easy;

/**
 * @date 2019/10/4 18:30
 */
public class _013_RomanToInt {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) return 0;
        int i = 0;
        int res = 0;
        res = toNumber(s.charAt(i));
        for (i = 1; i < s.length(); i++) {
            if (toNumber(s.charAt(i)) > toNumber(s.charAt(i - 1))) {
                res += toNumber(s.charAt(i)) - 2 * toNumber(s.charAt(i - 1));
            } else {
                res += toNumber(s.charAt(i));
            }
        }
        return res;
    }

    public int toNumber(char c) {
        /*
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
         */
        int res = 0;
        switch(c) {
            case 'I' : res = 1;break;
            case 'V' : res = 5;break;
            case 'X' : res = 10;break;
            case 'L' : res = 50;break;
            case 'C' : res = 100;break;
            case 'D' : res = 500;break;
            case 'M' : res = 1000;break;
        }
        return res;
    }
}
