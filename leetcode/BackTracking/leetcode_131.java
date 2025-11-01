package leetcode.BackTracking;

import java.util.*;

public class leetcode_131 {
    public static void main(String[] args) {
        String s = "nitin";
        System.out.println(partition(s));
    }
    public static List<List<String>> partition(String s){
        List<List<String>> ans = new ArrayList<>();
        pattern(s,new ArrayList<String>(),ans);
        return ans;
    }
    public static void pattern(String s,List<String> ans1,List<List<String>> ans){
        if(s.isEmpty()){
            ans.add(new ArrayList<>(ans1));
            // System.out.println(ans1);
            return;
        }
        for(int i = 0;i<s.length();i++){
            String n = s.substring(0, i+1);
            // String n1 = s.substring(i+1);
            if(is_Palindrome(n,0,i)){
                ans1.add(n);
                pattern(s.substring(i+1), ans1,ans);
                ans1.removeLast();
            }
        }
    }
    public static boolean is_Palindrome(String s,int left,int right){
        while(left<=right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
