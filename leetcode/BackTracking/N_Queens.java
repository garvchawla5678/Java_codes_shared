package leetcode.BackTracking;

import java.util.Arrays;

public class N_Queens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        Queen(board,0,n);
    }
    public static void Queen(boolean[][] board,int row,int tq){
        if(tq==0){
            display(board);
            return;
        }
        for(int col = 0;col<board.length;col++){
            if(isItSafe(board,row,col)){
                board[row][col] = true;
                Queen(board, row+1, tq-1);
                board[row][col] = false;
            }
        }
    }
    public static void display(boolean[][] board){
        for(int i = 0;i<board.length;i++){
            System.out.println(Arrays.toString(board[i]));
        }
        System.out.println();
    }
    public static boolean isItSafe(boolean[][] board,int row,int col){
        int column = col;
        for(int i = row-1;i>=0;i--){
            if(board[i][col]){
                return false;
            }
        }
        for(int i = row-1;i>=0;i--){
            column--;
            if(column >= 0 && board[i][column]){
                return false;
            }
        }
        column = col;
        for(int i = row-1;i>=0;i--){
            column++;
            if(column < board.length && board[i][column]){
                return false;
            }
        }
        return true;
    }
}
