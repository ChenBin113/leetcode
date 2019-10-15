package easy;

public class _006_ZigZagConversion {
    public String convert(String s, int numRows) {
        if (s.length() <= 1) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder("");
        }
        for (int i = 0; i < s.length(); i++) {
            int index = i % (numRows * 2 - 2);
            index = index < numRows ? index : numRows * 2 - 2 - index;
            sb[index].append(s.charAt(i));
        }
        for (int i = 0; i < sb.length; i++) {
            sb[0].append(sb[i]);
        }
        return sb.toString();
    }
}
