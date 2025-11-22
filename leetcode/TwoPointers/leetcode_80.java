package leetcode.TwoPointers;

public class leetcode_80 {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        System.out.println(removeDuplicates(arr));
    }

    static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return nums.length;
        }
        int j = 2;
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
