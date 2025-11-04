package leetcode.Sliding_Window;

public class leetcode_1004 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int cl = 0;
        int ml = 0;
        while (r != nums.length) {
            if (nums[r] == 1) {
                cl = r - l + 1;
                r++;
            } else {
                if (k > 0) {
                    cl = r - l + 1;
                    k--;
                    r++;
                } else {
                    while (k <= 0) {
                        if (nums[l] == 1) {
                            l++;
                        } else {
                            k++;
                            l++;
                        }
                    }
                    cl = r - l + 1;
                }
            }
            ml = Math.max(ml, cl);
        }
        return ml;
    }
}
