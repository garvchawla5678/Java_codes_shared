package leetcode.Sliding_Window;

import java.util.HashMap;

public class leetcode_219_optimized {
    static void main() {
        int[] arr = { 1, 2, 3, 1, 1, 5, 6 };
        int k = 3;
        System.out.println(containsNearbyDuplicate(arr, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int l = 0;
        int r = 1;
        freq.put(nums[l], 1);
        while (r < nums.length) {
            if (Math.abs(r - l) <= k) {
                if (freq.containsKey(nums[r])) {
                    return true;
                }
                freq.put(nums[r], 1);
                r++;
            } else {
                freq.remove(nums[l]);
                l++;
            }
        }
        return false;
    }
}
