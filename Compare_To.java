public class Compare_To {
    static void main() {
        String s1 = "Garv";
        String s2 = "Alya";
        System.out.println(compareTo(s1,s2));
    }
    public static int compareTo(String s1,String s2){
        if(s1==s2){
            return 0;
        }
        for(int i = 0;i<Math.min(s1.length(),s2.length());i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
    }
}
