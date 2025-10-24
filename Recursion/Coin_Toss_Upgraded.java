package Recursion;

public class Coin_Toss_Upgraded {
    static void main() {
        int n = 3;
        outcome(n,"");
    }
    static void outcome(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(ans.isEmpty() || ans.charAt(ans.length()-1) != 'H'){
            outcome(n-1,ans+"H");
        }
        outcome(n-1,ans+"T");
    }
}
