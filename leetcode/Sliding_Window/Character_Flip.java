package leetcode.Sliding_Window;

public class Character_Flip {
    static void main() {
        String gg = "abba";
        int k = 2;
        int ans = Math.max(maxMatchingSub(gg,k,'a'),maxMatchingSub(gg,k,'b'));
        System.out.println(ans);
    }
    public static int maxMatchingSub(String gg,int k,int ch){
        int strt = 0;
        int end = 0;
        int flip = 0;
        int ans = 0;
        while(strt<=end && end<gg.length()){
            if(gg.charAt(end) == ch){
                flip++;
            }
            while(flip>k && strt<=end){
                if(gg.charAt(strt) == ch){
                    flip--;
                }
                strt++;
            }
            ans = Math.max((end-strt+1),ans);
            end++;
        }
        return ans;
    }
}
