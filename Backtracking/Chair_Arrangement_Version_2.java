package Backtracking;

public class Chair_Arrangement_Version_2 {
    static void main() {
        int n = 4;
        boolean[] board = new boolean[n];
        int queens = 2;
        arrangement(board,queens,"",0);
    }

    public static void arrangement(boolean[] boxes, int queens, String ans,int count) {
        if(queens==count){
            System.out.println(ans);
            return;
        }
        for(int i = 0;i < boxes.length;i++){
            if(!boxes[i]) {
                boxes[i] = true;
                String hj = i+"th index -> "+count+"th queen, ";
                arrangement(boxes, queens , ans + hj, count + 1);
                // undo, so here we are using backtracking
                // this ensures that the queen is removed from
                // it's location after use, which is backtracking(removing it's trace)
                for(int j = i+1;j<boxes.length;j++){
                    boxes[j] = false;
                }
            }
        }
    }
}
