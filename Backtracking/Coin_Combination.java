package Backtracking;

public class Coin_Combination {
    static void main() {
        int[] arr = {1,3,2,5};
        int sum = 6;
        permutation(arr,sum,"",0);
    }

    public static void permutation(int[] arr, int sum, String ans,int idx) {
        if(sum==0){
            System.out.println(ans);
            return;
        }
        for(int i = idx;i<arr.length;i++){
            if(sum-arr[i] >= 0){
                sum -= arr[i];
                permutation(arr,sum,ans+arr[i],i);
                sum += arr[i];
            }
        }
    }
}
