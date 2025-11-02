package leetcode.Sliding_Window;

public class Subarray_product_lessThanK {
    static void main() {
        int[] arr = { 10, 5, 2, 6 };
        int k = 100;
        System.out.println(numSubarrayProductLessThanK(arr, k));
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int strt = 0;
        int end = 0;
        int ans = 0;
        int p = 1;
        while (end < nums.length) {
            // growing
            p = p * nums[end];
            // shrinking
            while (p >= k && strt <= end) {
                p = p / nums[strt];
                strt++;
            }
            // ans update
            ans = ans + (end - strt + 1);
            end++;
        }
        return ans;
    }
}
