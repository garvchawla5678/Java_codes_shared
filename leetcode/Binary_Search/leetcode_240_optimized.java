package leetcode.Binary_Search;

public class leetcode_240_optimized {
    static void main() {
        int[][] arr = {{1,1}};
        System.out.println(searchMatrix(arr,0));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;
        while(row< matrix.length && col >=0){
            if(matrix[row][col] == target){
                return true;
            } else if(matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
