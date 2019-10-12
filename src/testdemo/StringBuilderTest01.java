package testdemo;

/**
 * @date 2019/10/12 11:43
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append('.'); //0
        sb.append('.'); //1
        sb.append('.'); //2
        sb.append('.'); //3
        sb.setCharAt(2, 'Q');
        System.out.println(sb.toString());
    }
}
