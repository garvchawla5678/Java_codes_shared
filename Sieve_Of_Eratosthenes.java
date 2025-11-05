import java.util.*;

public class Sieve_Of_Eratosthenes {
    public static void main(String[] args) {
        int n = 2000;
        primeSieve(n);
    }

    static void primeSieve(int n) {
        boolean[] arr = new boolean[n + 1];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;
        for (int i = 2; i * i < arr.length; i++) {
            if (arr[i]) {
                for (int j = 2; j * i < arr.length; j++) {
                    arr[j * i] = false;
                }
            }
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
