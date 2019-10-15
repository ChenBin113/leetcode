package easy;

public class _007_ReverseInteger {
    /*
    主要还是溢出问题，考察整型变量的范围
    long & (int) 强转是事先预知数据溢出
    注意 Integer 的 MAX_VALUE & MIX_VALUE
     */
    public static int reverse(int x) {
        long res = 0;
        while(x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        }
        return (int)res;
    }
}
