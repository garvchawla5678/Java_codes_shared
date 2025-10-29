package Backtracking;

public class Coin_Permutation {
    static void main() {
        int[] arr = {1,3,2,5};
        int sum = 6;
        permutation(arr,sum,"");
    }

    public static void permutation(int[] arr, int sum, String ans) {
        if(sum==0){
            System.out.println(ans);
            return;
        }
        for(int i = 0;i<arr.length;i++){
            if(sum-arr[i] >= 0){
                // permutation(arr,sum-arr[i],ans+arr[i]);
                // this is solved using simple recursion
                // now for backtracking ->
                sum -= arr[i];
                permutation(arr,sum,ans+arr[i]);
                sum += arr[i];
            }
        }
    }
}
