package leetcode.Sliding_Window;

public class leetcode_209 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 11;
        System.out.println(minSubArray(arr, target));
    }

    static int minSubArray(int[] nums, int target) {
        int l = 0;
        int ml = Integer.MAX_VALUE;
        int sum = 0;
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum >= target) {
                ml = Math.min(end - l + 1, ml);
                sum -= nums[l];
                l++;
            }

        }
        if (ml == Integer.MAX_VALUE) {
            return 0;
        }
        return ml;
    }
}
