package greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @date 2019/10/10 15:51
 */
public class _452_MinimumNumberofArrowstoBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0 || points == null) return 0;
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        int start = points[0][0];
        int end = points[0][1];
        int arrow = 1;
        for (int i = 1; i < points.length; i++) {
            if (end >= points[i][0]) {
                if (points[i][1] <= end) {
                    end = points[i][1];
                }
                start = points[i][0];
            } else {
                start = points[i][0];
                end = points[i][1];
                arrow++;
            }
        }
        return arrow;
    }
}
