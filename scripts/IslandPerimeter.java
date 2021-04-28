//July Leetcoding Challenge - Week 1 - Island Perimeter
/*
You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.

Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).

The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

*/

import java.util.*;

class IslandPerimete {
    public int islandPerimeter(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        int perimeter = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) { // if land
                
                    perimeter += 4; //add this first nad then subtract from land around the cell
                    
                    //subtracting works by only checking valid i,j and without checking if land or not because water value is 0 anyway.
                    if (i > 0) perimeter -= grid[i - 1][j]; //up
                    if (i < r - 1) perimeter -= grid[i + 1][j]; // down
                    if (j > 0) perimeter -= grid[i][j - 1]; //left
                    if (j < c - 1) perimeter -= grid[i][j + 1]; //right
                }
            }
        }

        return perimeter;
    }
}