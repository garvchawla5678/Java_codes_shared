package Recursion;

public class FE {
    static void main() {
        int[] arr = {3,2,5,4,15,6,5,8,9};
        int k = 18;
        System.out.println(find_element(arr,k,0));
    }
    public static int find_element(int[] arr,int k,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == k){
            return i;
        }
        return find_element(arr,k,i+1);
    }
}
