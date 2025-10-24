package Recursion;

public class Permutation_Duplicate {
    static void main() {
        String pattern = "abca";
        patternSub(pattern,"");
    }

    public static void patternSub(String pattern, String ans) {
        if(pattern.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i = 0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(pattern.substring(i+1).contains(ch+"")){
               continue;
            }
            String s1 = pattern.substring(0,i);
            String s2 = pattern.substring(i+1);
            patternSub(s1+s2,ans+ch);
        }
    }
}
