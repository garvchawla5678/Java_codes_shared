package leetcode.TwoPointers;

import java.util.*;

public class ThreeSum_10 { // 0,0
    public static void main(String[] args) {
        int[] arr = { -1, 0, 0, 1, -1, 1, 2 }; // [-1,-1,0,0,1,1,2]
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans1 = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> jj = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int k = -(nums[i] + nums[j]);
                if (jj.contains(k)) {
                    List<Integer> gg = new ArrayList<>();
                    gg.add(nums[i]);
                    gg.add(nums[j]);
                    gg.add(k);
                    Collections.sort(gg);
                    ans1.add(new ArrayList<>(gg));
                }
                jj.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(ans1);
        return ans;
    }
}
