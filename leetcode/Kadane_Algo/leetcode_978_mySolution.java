package leetcode.Kadane_Algo;

public class leetcode_978_mySolution {
    static void main() {
        int[] arr= {100,100,100};
        System.out.println(maxTurbulenceSize(arr));
    }
    static int maxTurbulenceSize(int[] arr) {
        if(arr.length<=1){
            return arr.length;
        }
        int noeq = 0;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                noeq++;
            }
        }
        if(arr.length == (noeq+1)){
            return 1;
        }
        if(arr.length==2){
            if(arr[0] != arr[1]){
                return 2;
            } else{
                return 1;
            }
        }
        int cl = 0;
        int ml = 0;
        int l = 0;
        int r = 1;
        while(r<arr.length-1){
            if((arr[r] > arr[r-1] && arr[r] > arr[r+1]) || (arr[r] < arr[r-1] && arr[r] < arr[r+1])){
                r++;
            } else if(arr[r] == arr[r+1]){
                l=r;
            }
            else{
                l = r;
                r++;
            }
            cl = r-l+1;
            ml = Math.max(ml,cl);
        }
        return ml;
    }
}
