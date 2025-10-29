package leetcode.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_40 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 2, 1, 2 };
        int target = 5;
        System.out.println(combinationSum(arr, target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> ans1 = new ArrayList<>();
        Arrays.sort(candidates); // [1,2,2,2,5]
        combination(candidates, target, ans, 0, ans1);
        return ans1;
    }

    public static void combination(int[] arr, int sum, List<Integer> jj, int idx, List<List<Integer>> ans1) {
        if (sum == 0) {
            // System.out.println(jj);
            List<Integer> nw = new ArrayList<>(jj);
            ans1.add(nw);
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1]) {
                continue;
            }
            if (sum - arr[i] >= 0) {
                jj.add(arr[i]);
                combination(arr, sum - arr[i], jj, i + 1, ans1);
                jj.removeLast();
            } else {
                break;
            }
        }
    }
}
