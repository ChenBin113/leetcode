package search;

import java.util.LinkedList;
import java.util.Queue;

public class _200_NumberofIslands {
    //DFS
    public int numIslands1(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int[][] mark = new int[grid.length][grid[0].length];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (mark[i][j] == 0 && grid[i][j] == '1') {
                    DFS(grid, mark, i, j, dx, dy);
                    count++;
                }
            }
        }
        return count;
    }

    public void DFS(char[][] grid, int[][] mark, int x, int y, int[] dx, int[] dy) {
        mark[x][y] = 1;
        for (int i = 0; i < 4; i++) {
            int new_x = x + dx[i];
            int new_y = y + dy[i];
            if (new_x < 0 || new_x >= mark.length || new_y < 0 || new_y >= mark[x].length) {
                continue;
            }
            if (grid[new_x][new_y] == '1' && mark[new_x][new_y] == 0) {
                DFS(grid, mark, new_x, new_y, dx, dy);
            }
        }
    }

    //BFS
    public static int numIslands2(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int[][] mark = new int[grid.length][grid[0].length];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        int count = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (mark[i][j] == 0 && grid[i][j] == '1') {
                    BFS(grid, mark, i, j, dx, dy, queue);
                    count++;
                }
            }
        }
        return count;
    }

    public static void BFS(char[][] grid, int[][] mark, int x, int y, int[] dx, int[] dy, Queue<int[]> queue) {
        queue.offer(new int[]{x,y});
        mark[x][y] = 1;
        while (!queue.isEmpty()) {
            int[] coord = queue.poll();
            int row = coord[0];
            int col = coord[1];
            for (int i = 0; i < 4; i++) {
                int new_x = dx[i] + row;
                int new_y = dy[i] + col;
                if (new_x < 0 || new_x >= mark.length || new_y < 0 || new_y >= mark[row].length) {
                    continue;
                }
                if (mark[new_x][new_y] == 0 && grid[new_x][new_y] == '1') {
                    queue.offer(new int[]{new_x, new_y});
                    mark[new_x][new_y] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        numIslands2(grid);
    }
}
