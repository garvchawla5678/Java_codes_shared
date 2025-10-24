package Recursion;

public class Power_Calculate {
    static void main() {
        int n = 3;
        int k = 3;
        System.out.println(power_of(n,k));
        print(5);
    }
    public static int power_of(int n,int k){
        if(k==0){
            return 1;
        }
        return n*power_of(n,k-1);
    }
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
