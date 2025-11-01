package leetcode.BackTracking;

// ****

public class leetcode_79 {
    public static void main(String[] args) {
        String word = "ABCB";
        char[][] grid = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };
        boolean ans = false;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (word.charAt(0) == grid[i][j]) {
                    ans = wordSearch(grid, word, i, j, 0);
                    if (ans) {
                        System.out.println(ans);
                        return;
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static boolean wordSearch(char[][] maze, String word, int row, int col, int idx) {
        if (idx == word.length()) {
            return true;
        }
        if (row < 0 || row >= maze.length || col < 0 || col >= maze[row].length || word.charAt(idx) != maze[row][col]) {
            return false;
        }
        maze[row][col] = '&';
        int[] r = { 0, 0, 1, -1 };
        int[] c = { 1, -1, 0, 0 };
        for (int i = 0; i < r.length; i++) {
            boolean ans = wordSearch(maze, word, row + r[i], col + c[i], idx+1);
            if(ans){
                return true;
            }
        }
        maze[row][col] = word.charAt(idx);
        return false;
    }
}
