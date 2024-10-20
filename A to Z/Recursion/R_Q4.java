public class R_Q4 {

    public static void print(int s) {
        if (s <= 0) {
            return;
        }
        print(s - 1);
        System.out.println(s);
    }

    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
