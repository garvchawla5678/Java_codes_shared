package leetcode.Recursion;

public class leetcode_17 {
    static String[] arr = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    static void main() {
        String digits = "237";
        pattern(digits, "");
    }

    static void pattern(String digit, String ans) {
        if (digit.isEmpty()) {
            System.out.println(ans);
            return;
        }
        int ch = (int) digit.charAt(0) - 48;
        String jj = arr[ch];
        for (int i = 0; i < jj.length(); i++) {
            pattern(digit.substring(1), ans + jj.charAt(i));
        }
    }
}
