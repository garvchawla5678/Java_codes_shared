package leetcode.TwoPointers;

import java.util.Arrays;

public class leetcode_283 {
    static void main() {
        int[] arr = {0,1,0,3,12};
        System.out.println(Arrays.toString(arr));
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void moveZeroes(int[] arr){
        int i = 0;
        int insert = 0;
        while(i<arr.length){
            if(arr[i] == 0){
                i++;
            } else {
                arr[insert] = arr[i];
                i++;
                insert++;
            }
        }
        for(int j = insert;j<arr.length;j++){
            arr[j] = 0;
        }
    }
}
