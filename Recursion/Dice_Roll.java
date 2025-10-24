package Recursion;

public class Dice_Roll {
    static void main() {
        int n = 4;
        path(n,"");
    }
    static void path(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if((n-1)>=0) {
            path(n - 1, ans + "1");
        }
        if((n-2)>=0) {
            path(n - 2, ans + "2");
        }
        if((n-3)>=0) {
            path(n - 3, ans + "3");
        }
    }
}
