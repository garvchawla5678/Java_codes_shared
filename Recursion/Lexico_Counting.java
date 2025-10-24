package Recursion;

public class Lexico_Counting {
    static void main() {
        int n = 1000;
        printCounting(n,0);
    }

    public static void printCounting(int n, int curr) {
        if(curr>n){
            return;
        }
        System.out.println(curr);
        int i = 0;
        if(curr==0){
            i = 1;
        }
        for(;i<=9;i++){
            printCounting(n,curr*10+i);
        }
    }
}
