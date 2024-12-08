public class Problem2 {

    // Character Hashing

    public static void main(String[] args) {
        int arr[] = new int[256];
        String str = "Siddharth";

        for (Character x : str.toCharArray()) {
            arr[x]++;
        }

        System.out.println("S  " + arr['S']);
        System.out.println("i " + arr['i']);
        System.out.println("h " + arr['h']);
        System.out.println("d " + arr['d']);
    }
}
