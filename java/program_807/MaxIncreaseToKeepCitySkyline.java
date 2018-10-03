package program_807;

import java.util.*;

public class MaxIncreaseToKeepCitySkyline {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        return getMaxLine(grid);
    }

    private Integer getMaxLine(int[][] grid) {
        Integer count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                List<Integer> row = getRow(i, grid);
                List<Integer> col = getCol(j, grid);
                Integer maxRow = Collections.max(row);
                Integer maxCol = Collections.max(col);
                count += (maxRow > maxCol ? maxCol : maxRow) - grid[i][j];
            }
        }
        return count;
    }

    private List<Integer> getCol(Integer i, int[][] grid) {
        List<Integer> col = new ArrayList<>();
        for (int j = 0; j < grid.length; j++) {
            col.add(grid[j][i]);
        }
        return col;
    }

    private List<Integer> getRow(Integer i, int[][] grid) {
        List<Integer> row = new ArrayList<>();
        for (int j = 0; j < grid[i].length; j++) {
            row.add(grid[i][j]);
        }
        return row;
    }
}
