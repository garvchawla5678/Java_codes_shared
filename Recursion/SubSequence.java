package Recursion;

public class SubSequence {
    static void main() {
        String ques = "abcd";
        PrintSun(ques,"");
    }
    static void PrintSun(String ques,String ans){
        if(ques.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        PrintSun(ques.substring(1),ans);
        PrintSun(ques.substring(1),ans+ch);
    }
}
