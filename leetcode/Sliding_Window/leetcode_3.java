package leetcode.Sliding_Window;

import java.util.HashSet;

public class leetcode_3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    static int lengthOfLongestSubstring(String s) {
        HashSet<Character> freq = new HashSet<>();
        int ml = Integer.MIN_VALUE;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            while (freq.contains(s.charAt(r))) {
                freq.remove(s.charAt(l));
                l++;
            }
            ml = Math.max(ml, r - l + 1);
            freq.add(s.charAt(r));
        }
        if (ml == Integer.MIN_VALUE) {
            return 0;
        }
        return ml;
    }
}
