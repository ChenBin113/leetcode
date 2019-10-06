package game;

/**
 * @date 2019/10/6 11:14
 */
public class _5213_MinCostToMoveChips {
    public int minCostToMoveChips(int[] chips) {
        if (chips.length == 1) return 0;
        int single = 0;
        int dou = 0;
        for (int i = 0; i < chips.length; i++) {
            if (chips[i] % 2 == 0) dou++;
            else single++;
        }
        if (single > dou) return dou;
        else return single;
    }
}
