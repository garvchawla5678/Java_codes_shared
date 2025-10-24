public class Wave_Print {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20}
        };
        for(int i = 0;i< arr[i].length;i++){
            for(int j = 0;j<arr.length;j++){
                if((i&1)==1){
                    System.out.print(arr[arr[i].length-j][i]+" ");
                } else {
                    System.out.print(arr[j][i]+" ");
                }
            }
            System.out.println();
        }
    }
}
