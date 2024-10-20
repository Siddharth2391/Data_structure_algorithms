public class R_Q1 {
    // Print name n times
    public static void print(int s, int e) {
        if (s == e) {
            return;
        }
        System.err.println("Java");
        s++;
        print(s, e);
    }

    public static void main(String[] args) {
        int n = 5;
        print(0, n);
    }
}
