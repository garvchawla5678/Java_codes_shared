package Recursion;

public class Chair_Arrangement {
    static void main() {
        String boxes = "0123";
        int queens = 4;
        arrangement(boxes,queens,"",1);
    }

    public static void arrangement(String boxes, int queens, String ans,int count) {
        if(queens==0){
            System.out.println(ans);
            return;
        }
        for(int i = 0;i < boxes.length();i++){
            char ch = boxes.charAt(i);
            String hj = ch+"th index -> "+count+"th queen, ";
            String s1 = boxes.substring(0,i);
            String s2 = boxes.substring(i+1);
            arrangement(s1+s2,queens-1,ans+hj,count+1);
        }
    }
}
