package leetcode.Kadane_Algo;

public class leetcode_918 {
    static void main() {
        int[] arr = {-3,-2,-3};
        System.out.println(maxSubArray(arr));
    }
    static int maxSubArray(int[] arr){
        if(arr.length == 1){
            return arr[0];
        }
        int arrSum = 0;
        for(int i: arr){
            arrSum += i;
        }
        int ans = Integer.MIN_VALUE;
        int curSum = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum = curSum + arr[i];
            if (curSum > ans) {
                ans = curSum;
            }
            if (curSum < 0) {
                curSum = 0;
            }
        }
        int ans1 = Integer.MAX_VALUE;
        int curSum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum1 = curSum1 + arr[i];
            if (curSum1 < ans1) {
                ans1 = curSum1;
            }
            if (curSum1 > 0) {
                curSum1 = 0;
            }
        }
        if(arrSum<0){
            return ans;
        }
        return Math.max(ans,arrSum-ans1);
    }
}
