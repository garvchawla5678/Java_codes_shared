package Recursion;

public class Fibo {
    static void main() {
        int n = 50;
        System.out.println(fibonacci(n));
    }
    static long fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
