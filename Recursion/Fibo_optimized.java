package Recursion;

import java.util.Arrays;

public class Fibo_optimized {
    static void main() {
        int n = 50;
        long[] dp = new long[n+1];
        Arrays.fill(dp,Long.MIN_VALUE);
        dp[0] = 0;
        dp[1] = 1;
        System.out.println(Fibonacci(n,dp));
    }
    static long Fibonacci(int n,long[] dp){
        if(dp[n] >= 0){
            return dp[n];
        } else {
            dp[n] = Fibonacci(n-1,dp)+Fibonacci(n-2,dp);
        }
        return dp[n];
    }
}
