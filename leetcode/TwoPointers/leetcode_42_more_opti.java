package leetcode.TwoPointers;

public class leetcode_42_more_opti {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(arr));
    }

    static int trap(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }
        int l = 0;
        int r = n - 1;
        int maxl = height[l];
        int maxr = height[r];
        int ans = 0;
        while (l < r) {
            if (maxl < maxr) {
                l++;
                maxl = Math.max(maxl, height[l]);
                ans += maxl - height[l];
            } else {
                r--;
                maxr = Math.max(maxr, height[r]);
                ans += maxr - height[r];
            }
        }
        return ans;
    }
}
