package leetcode.TwoPointers;

public class leetcode_42 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(arr));
    }

    static int trap(int[] height) {
        int n = height.length;
        int left_max[] = new int[n];
        int right_max[] = new int[n];
        int max_value = 0, res = 0;

        for (int i = 0; i < n; i++) {
            max_value = Math.max(max_value, height[i]);
            left_max[i] = max_value;
        }

        max_value = 0;

        for (int i = n - 1; i >= 0; i--) {
            right_max[i] = max_value;
            max_value = Math.max(max_value, height[i]);
        }

        for (int i = 0; i < n; i++) {
            int add = Math.min(left_max[i], right_max[i]) - height[i];
            if (add > 0)
                res += add;
        }
        return res;
    }
}
