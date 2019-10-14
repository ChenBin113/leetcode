package testdemo;

/**
 * @date 2019/10/14 1:27
 */
public class IntegerTest01 {
    public static void main(String[] args) {
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        System.out.println(x == y); // false
        Integer z = Integer.valueOf(128);
        Integer k = Integer.valueOf(128);
        System.out.println(z == k); // true
    }
}
