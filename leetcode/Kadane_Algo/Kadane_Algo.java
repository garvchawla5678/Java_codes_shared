package leetcode.Kadane_Algo;

public class Kadane_Algo {
    static void main() {
        int[] arr = { -5, 3, 5 };
        System.out.println(maxSubArray(arr));
    }

    static int maxSubArray(int[] arr) {
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
        return ans;
    }
}
