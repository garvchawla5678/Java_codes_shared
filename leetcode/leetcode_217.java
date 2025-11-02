package leetcode;

import java.util.HashSet;

public class leetcode_217 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 1 };
        System.out.println(containsDuplicate(arr));
    }

    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> frq = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (frq.contains(nums[i])) {
                return true;
            }
            frq.add(nums[i]);
        }
        return false;
    }
}
