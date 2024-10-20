public class R_Sum_n {
    // Parameterized Recursion sum of n numbers
    public static void sum(int n, int s) {
        if (n < 0) {
            System.out.println(s);
            return;
        }
        sum(n - 1, s + n);
    }

    public static void main(String[] args) {
        int n = 15;
        sum(n, 0);
    }
}
