package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class Add_Two_Numbers {
    static void main() {
        int[] arr1 = {9,8};
        int[] arr2 = {7,7};
        ArrayList<Integer> ans = addition(arr1,arr2);
        Collections.reverse(ans);
        System.out.println(ans);
    }

    public static ArrayList<Integer> addition(int[] arr1, int[] arr2) {
        int min_len = Math.min(arr1.length, arr2.length);
        int p = arr1.length-1;
        int j = arr2.length-1;
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 0;
        for(int i = min_len-1;i>=0;i--){
            int num = arr1[p--] + arr2[j--]+carry;
            carry = 0;
            if(num >= 10){
                carry = num/10;
            }
            ans.add(num%10);
        }
        while(p>=0){
            int num = arr1[p--]+carry;
            carry = 0;
            if(num >= 10){
                carry = num/10;
            }
            ans.add(num%10);
        }
        while(j>=0){
            int num = arr2[j--]+carry;
            carry = 0;
            if(num >= 10){
                carry = num/10;
            }
            ans.add(num%10);
        }
        if(carry!=0){
            ans.add(carry);
        }
        return ans;
    }
}
