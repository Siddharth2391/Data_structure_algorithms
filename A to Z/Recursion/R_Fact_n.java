public class R_Fact_n {
    // paramterized fact
    public static void fact(int n, int f) {
        if (n < 1) {
            System.out.println(f);
            return;
        }
        fact(n - 1, f * n);
    }

    // Functional fact
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        fact(n, 1);
        fact(n);
    }
}
