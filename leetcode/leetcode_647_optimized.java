package leetcode;

public class leetcode_647_optimized {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(countSubstrings(s));
    }

    public static int countSubstrings(String s) {
        int count = 0;
        // odd substrings check whether they are palindrome or not
        for (int axis = 0; axis < s.length(); axis++) {
            for (int orbit = 0; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
                if (s.charAt(axis - orbit) != s.charAt(axis + orbit)) {
                    break;
                }
                count++;
            }
        }
        // even substrings check whether they are palindrome or not
        for (double axis = 0.5; axis < s.length(); axis++) {
            for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
                if (s.charAt((int) (axis - orbit)) != s.charAt((int) (axis + orbit))) {
                    break;
                }
                count++;
            }
        }
        return count;
    }
}
