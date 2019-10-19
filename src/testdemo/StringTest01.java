package testdemo;

public class StringTest01 {
    public static void main(String[] args) {
        String s = "abcdef";
        for (int i = 0; i < s.length() - 1; i++) {
            String temp = s.substring(i, i + 2);
            System.out.println(temp);
        }
    }
}
