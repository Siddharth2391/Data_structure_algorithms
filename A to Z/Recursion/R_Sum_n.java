public class R_Sum_n {
    // Parameterized Recursion sum of n numbers
    public static void sum(int n, int s) {
        if (n < 0) {
            System.out.println(s);
            return;
        }
        sum(n - 1, s + n);
    }

    // Functional Recursion sum of n numbers
    public static int sum1(int n) {
        if (n < 0) {
            return 0;
        }
        return n + sum1(n - 1);
    }

    public static void main(String[] args) {
        int n = 115;
        sum(n, 0); // parameterized
        sum1(5); //
    }
}
