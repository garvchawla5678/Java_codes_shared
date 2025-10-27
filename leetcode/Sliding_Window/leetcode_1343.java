package leetcode.Sliding_Window;

public class leetcode_1343 {
    static void main() {
        int[] arr = {11,13,17,23,29,31,7,5,2,3};
        int k = 3;
        int threshold = 5;
        System.out.println(numOfSubarrays(arr,k,threshold));
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        int avg;
        int l = 0;
        int r = 0;
        while(r<arr.length){
            if((r-l+1) <= k){
                sum += arr[r];
                if((r-l+1) == k){
                    avg = sum/k;
                    if(avg>=threshold){
                        count++;
                    }
                }
                r++;
            } else {
                sum -= arr[l];
                l++;
            }
        }

        return count;
    }
}
