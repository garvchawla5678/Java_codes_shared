public class Power_logN {
    public static void main(String[] args) {
        int n = 3;
        int x = 5;
        System.out.println(pow(n, x));
    }

    static int pow(int n, int x) {
        if (x == 0) {
            return 1;
        }
        int ans = pow(n, x / 2);
        ans *= ans;
        if (x % 2 != 0) {
            ans = ans * n;
        }
        return ans;
    }
}
