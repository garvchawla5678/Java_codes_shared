package Recursion;

public class ToH {
    static void main() {
        int n = 3;
        tower(n,"A","B","C");
    }

    public static void tower(int n, String src, String hlp, String des) {
        if(n==0){
            return;
        }
        tower(n-1,src,des,hlp);
        System.out.println("Move "+n+"th from "+src+" to "+des);
        tower(n-1,hlp,src,des);
    }
}
