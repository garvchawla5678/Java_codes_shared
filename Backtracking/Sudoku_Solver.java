package Backtracking;

public class Sudoku_Solver {
    public static void main(String[] args) {
        int[][] grid = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };
        solver(grid, 0, 0);
    }

    static void solver(int[][] grid, int cr, int cc) {
        if (cc == 9) {
            cr++;
            cc = 0;
        }
        if (cr == 9) {
            display(grid);
            return;
        }
        if (grid[cr][cc] != 0) {
            solver(grid, cr, cc + 1);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isItSafe(grid, cr, cc, i)) {
                    grid[cr][cc] = i;
                    solver(grid, cr, cc + 1);
                    grid[cr][cc] = 0;
                }
            }
        }
    }

    static boolean isItSafe(int[][] grid, int cr, int cc, int val) {
        for (int i = 0; i < 9; i++) {
            if (grid[cr][i] == val) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (grid[i][cc] == val) {
                return false;
            }
        }
        int r = cr - (cr % 3);
        int c = cc - (cc % 3);
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (grid[i][j] == val) {
                    return false;
                }
            }
        }
        return true;
    }

    static void display(int[][] grid) {
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
