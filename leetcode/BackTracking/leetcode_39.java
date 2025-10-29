package leetcode.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class leetcode_39 {
    static void main() {
        int[] arr = { 1, 3, 2, 5 };
        int target = 6;
        System.out.println(combinationSum(arr, target));

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> ans1 = new ArrayList<>();
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
            if (sum - arr[i] >= 0) {
                jj.add(arr[i]);
                combination(arr, sum - arr[i], jj, i, ans1);
                jj.removeLast();
            }
        }
    }
}
