package backtracking;

import java.util.ArrayList;
import java.util.List;

public class ParenthesisTest {
    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>();
        helper("", 2, result);
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static void helper(String item, int n, List<String> result) {
        if (item.length() == 2 * n) {
            result.add(item);
            return;
        }
        helper(item + "(", n, result);
        helper(item + ")", n, result);
    }
}
