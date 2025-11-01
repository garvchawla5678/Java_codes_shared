package leetcode.TwoPointers;

public class leetcode_125 {
    public static void main(String[] args) {
        String s = "0P";
        s = s.toLowerCase();
        System.out.println(s);
        String final1 = "";
        for(int i = 0;i<s.length();i++){
            if((s.charAt(i) >= 97 && s.charAt(i) <= 122) || s.charAt(i) >= 48 && s.charAt(i) <= 57){
                final1 += s.charAt(i);
            }
        }
        System.out.println(final1);
        System.out.println(isPalindrome(final1));
    }
    public static boolean isPalindrome(String s){
        if (s.length() == 1){
            return true;
        }
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
