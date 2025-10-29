package leetcode.Sliding_Window;

import java.util.Arrays;
import java.util.HashMap;

public class leetcode_1 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 3, 1, 5 };
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> frq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int ele = target - nums[i];
            if (frq.containsKey(ele)) {
                return new int[] { i, frq.get(ele) };
            }
            frq.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }
}
