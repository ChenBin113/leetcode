package easy;

public class _013_LongestCommonPrefix {
    /**
     * time: O(n)
     * space: O(1)
     * @param strs
     * @return
     */
    /*
    以第一个为标准，不断和后面的字符串比较，进行删减
     */
    public static String longestCommonPrefix(String[] strs) {
        //边界
        if (strs.length == 0 || strs == null) {
            return "";
        }
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            //index 如果找到，则返回 0；如果找不到，则返回 -1
            //"" 空字符串可以认为是被字符串包含，所以一定能找到，一定有终止条件
            while (strs[i].indexOf(res) != 0) {
                res = res.substring(0, res.length() - 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        //String[] strs = {"javascript", "java", "javabean"};
        String[] strs = {"aavascript", "bava", "cavabean"};
        String s = _013_LongestCommonPrefix.longestCommonPrefix(strs);
        System.out.println(s + "10086");
    }
}
