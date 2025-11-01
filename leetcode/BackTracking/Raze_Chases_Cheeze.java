package leetcode.BackTracking;

public class Raze_Chases_Cheeze {
    public static void main(String[] args) {
        char[][] maze = {
            {'O','X','O','O'},
            {'O','O','O','X'},
            {'X','O','X','O'},
            {'X','O','O','X'},
            {'X','X','O','O'}
        };
        int[][] sol = new int[maze.length][maze[1].length];
        razeInMaze(maze, 0, 0, sol);
    }
    public static void display(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void razeInMaze(char[][] maze,int start,int end,int[][] sol){
        if(start == maze.length-1 && end == maze[1].length-1 && maze[start][end] != 'X'){
            sol[start][end] = 1;
            display(sol);
            return;
        }
        if(start < 0 || start >= maze.length || end < 0 || end >= maze[1].length || maze[start][end] == 'X'){
            return;
        }
        int[] r = {0,0,1,-1};
        int[] c = {1,-1,0,0};
        maze[start][end] = 'X';
        sol[start][end] = 1;
        for(int i = 0;i<r.length;i++){
            razeInMaze(maze, start+r[i], end+c[i], sol);
        }
        // razeInMaze(maze, start, end+1, sol);
        // razeInMaze(maze, start, end-1, sol);
        // razeInMaze(maze, start+1, end, sol);
        // razeInMaze(maze, start-1, end, sol);
        maze[start][end] = 'O';
        sol[start][end] = 0;
    }
}
