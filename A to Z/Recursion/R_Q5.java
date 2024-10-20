public class R_Q5 {
    public static void print(int s, int e) {
        if (s > e) {
            return;
        }
        print(s + 1, e);
        System.out.println(s);
    }

    public static void main(String[] args) {
        int n = 5;
        print(1, n);
    }
}
