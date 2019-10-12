package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2019/10/12 9:45
 */
public class _022_GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0) return result;
        helper(result, n, n, "");
        return result;
    }

    public void helper(List<String> result, int left, int right, String item) {
        if (left == 0 && right == 0) {
            result.add(item);
            return;
        }
        if (left > 0) {
            helper(result, left - 1, right, item + "(");
        }
        if (right > left) {
            helper(result, left, right - 1, item + ")");
        }
    }
}
