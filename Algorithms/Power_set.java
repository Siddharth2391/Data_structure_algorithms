import java.util.ArrayList;

/**
 * Power_set
 */
public class Power_set {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = (1 << (arr.length)) - 1;
        for (int i = 0; i <= n; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                if (((1 << j) & i) != 0) {
                    al.add(arr[j]);
                }
            }
            System.out.println(al);
        }
    }

}