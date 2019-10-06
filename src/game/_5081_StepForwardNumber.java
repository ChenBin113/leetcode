package game;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2019/10/5 23:49
 */
public class _5081_StepForwardNumber {

    /**
     * 如果一个整数上的每一位数字与其相邻位上的数字的绝对差都是 1，那么这个数就是一个「步进数」。
     * 例如，321 是一个步进数，而 421 不是。
     * 给你两个整数，low 和 high，请你找出在 [low, high] 范围内的所有步进数，并返回 排序后 的结果。
     *
     * 该方法：最大的测试案例超出时间限制
     *
     * @param low
     * @param high
     * @return
     */
    public static List<Integer> countSteppingNumbers(int low, int high) {
        List<Integer> res = new ArrayList<>();
        int number;
        for (int i = low; i <= high; i++) {
            int num_copy = i;
            if (i <= 10) {
                res.add(num_copy);
                continue;
            }
            number = i;
            while (number != 0) {
                int after = number % 10;
                int quotient = number / 10;
                if (Math.abs(after - quotient % 10) != 1) break;
                if (quotient < 10) {
                    res.add(num_copy);
                    break;
                }
                number = quotient;
            }
            if (number == 0) {
                res.add(num_copy);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> list = countSteppingNumbers(19, 22);

    }
}
