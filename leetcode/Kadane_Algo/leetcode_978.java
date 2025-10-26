package leetcode.Kadane_Algo;

public class leetcode_978 {
    static void main() {
        int[] arr= {9,4,2,10,7,8,8,1,9};
        System.out.println(maxTurbulenceSize(arr));
    }
    static int maxTurbulenceSize(int[] arr) {
        if (arr.length <= 1) {
            return arr.length;
        }
        int l = 0;
        int r = 1;
        int cl = 0;
        int ml = 1;
        String symbol = "";
        while (r < arr.length) {
            if((arr[r] < arr[r-1]) && !symbol.equals(">")){
                symbol = ">";
                cl = r-l+1;
                r++;
            } else if((arr[r] > arr[r-1]) && !symbol.equals("<")){
                symbol = "<";
                cl = r-l+1;
                r++;
            } else if(arr[r] == arr[r-1]){
                symbol="";
                l=r;
                r++;
            } else{
                symbol="";
                l = r-1;
                // r++;
            }
            // cl = r-l+1;
            ml = Math.max(ml,cl);
        }
        return ml;
    }
}
