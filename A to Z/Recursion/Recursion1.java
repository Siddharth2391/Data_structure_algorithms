class Recursion1 {
    static int cnt = 0;

    public static void fn() {
        if (cnt == 3) {
            return;
        }
        System.err.println(cnt);
        cnt++;
        fn();
    }

    public static void main(String[] args) {
        fn();
    }
}