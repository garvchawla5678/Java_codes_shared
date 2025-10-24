package Recursion;

public class Maze_Prblm {
    static void main() {
        patternpath(0,0,3,4,"");
    }

    public static void patternpath(int counter1,int counter2,int m, int n,String ans) {
        if(counter1==(m) && counter2==(n)){
            System.out.println(ans);
            return;
        }
        if(counter1<m){
            patternpath(counter1+1,counter2,m,n,ans+"V");
        }
        if(counter2<n){
            patternpath(counter1,counter2+1,m,n,ans+"H");
        }
    }
}
