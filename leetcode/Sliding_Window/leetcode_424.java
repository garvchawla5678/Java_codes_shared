package leetcode.Sliding_Window;

public class leetcode_424 {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }

    static int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int l = 0;
        int ml = Integer.MIN_VALUE;
        int maxf = 0;
        for (int r = 0; r < s.length(); r++) {
            count[s.charAt(r) - 'A']++;
            for (int i = 0; i < count.length; i++) {
                maxf = Math.max(count[i], maxf);
            }
            if ((r - l + 1) - maxf <= k) {
                ml = Math.max(r - l + 1, ml);
            }
            while ((r - l + 1) - maxf > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            }
        }
        return ml == Integer.MIN_VALUE ? 0 : ml;
    }
}
