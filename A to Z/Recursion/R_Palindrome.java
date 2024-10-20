public class R_Palindrome {

    public static boolean check(String str, int s, int e) {
        if (s >= e) {
            return true;
        }
        if (str.charAt(s) != str.charAt(e)) {
            return false;
        }
        return check(str, s + 1, e - 1);
    }

    public static boolean check(String str, int i) {
        if (i <= str.length() - 1 / 2) {
            return true;
        }
        if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
            return false;
        }
        return check(str, i - 1);
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(check(str, 0, str.length() - 1));
        System.out.println(check(str, str.length() - 1));
    }
}
