public class R_Q2 {
    // print 1 to N
    public static void print1(int s, int e) {
        if (s > e) {
            return;
        }
        System.err.println(s);
        print1(s + 1, e);
    }

    // print N to 1
    public static void print2(int s) {
        if (s <= 0) {
            return;
        }
        System.err.println(s);
        print2(s - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        print1(1, n);
        print2(n);
    }
}
