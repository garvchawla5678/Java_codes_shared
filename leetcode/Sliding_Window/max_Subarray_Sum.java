package leetcode.Sliding_Window;

public class max_Subarray_Sum {
    static void main() {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println(maxSubArraySum(arr,k));
    }
    public static int maxSubArraySum(int[] arr,int k){
        int ans;
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum += arr[i];
        }
        ans = sum;
        for(int i = k;i<arr.length;i++){
            sum += arr[i];
            sum -= arr[i-k];
            ans = Math.max(sum,ans);
        }
        return ans;
    }
}
