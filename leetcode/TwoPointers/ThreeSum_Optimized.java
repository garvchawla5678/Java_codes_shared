package leetcode.TwoPointers;

import java.util.*;

public class ThreeSum_Optimized {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 0, 1, -1, 1, 2 }; // [-1,-1,0,0,1,1,2]
        Arrays.sort(arr);
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> gg = new ArrayList<>();
                    gg.add(nums[i]);
                    gg.add(nums[j]);
                    gg.add(nums[k]);
                    ans.add(new ArrayList<>(gg));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return ans;
    }
}
