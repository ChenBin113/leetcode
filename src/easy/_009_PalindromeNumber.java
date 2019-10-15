package easy;

public class _009_PalindromeNumber {
    /**
     * time O(n)
     * space O(1)
     * @param x
     * @return
     */
    /*
    注意：
    1.边界问题，注意 && 运算优先 ||
    2.没有存原始 x
    3.return 部分可以更加精简
     */
    public boolean isPalindrome(int x) {
        //负数带负号
        //1000 100 等不能为回文数，0 除外
        if (x < 0 || x != 0 && x % 10 == 0) return false;
        int res = 0;
        int palind = x;
        while (x != 0) {
            res = x % 10 + res * 10;
            x /= 10;
        }
        return res == palind;
    }

    public static void main(String[] args) {
        System.out.println(false && true || true); //true 说明先运算 && 再运算 ||
        System.out.println(true || true && false); //true 说明先运算 && 再运算 ||
    }
}
