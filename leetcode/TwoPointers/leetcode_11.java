package leetcode.TwoPointers;

public class leetcode_11 {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(arr));
    }

    static int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n - 1;
        int ma = Integer.MIN_VALUE;
        int ca = 0;
        while (l < r) {
            int min = Math.min(height[l], height[r]);
            ca = min * (r - l);
            ma = Math.max(ca, ma);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return ma;
    }
}
