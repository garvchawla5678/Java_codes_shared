package leetcode.Sliding_Window;

public class leetcode_219 {
    static void main() {
        int[] arr = { 1, 2, 3, 4, 1, 5, 6 };
        int k = 3;
        System.out.println(containsNearbyDuplicate(arr, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int l = 0;
        int r = 1;
        if (k == 0) {
            return false;
        }
        while (nums.length - l >= 2) {
            // shrink
            if (Math.abs(l - r) > k || r >= nums.length) {
                l++;
                r = l + 1;
            } else if (nums[l] != nums[r] && Math.abs(l - r) <= k) { // grow
                r++;
            } else {
                return true;
            }
        }
        return false;
    }
}
