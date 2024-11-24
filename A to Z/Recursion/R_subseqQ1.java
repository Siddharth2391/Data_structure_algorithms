import java.util.*;

public class R_subseqQ1 {

    public static void sub(int arr[], int i, ArrayList<Integer> al, int check, int sum) {
        if (i == arr.length) {
            if (check == sum) {
                System.out.println(al);
            }
            return;
        }
        al.add(arr[i]);
        sub(arr, i + 1, al, check, sum + arr[i]); // take
        al.remove(al.size() - 1);
        sub(arr, i + 1, al, check, sum + arr[i]); // not take
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1 };
        int sum = 3;
        ArrayList<Integer> al = new ArrayList<>();
        sub(arr, 0, al, sum, 0);
    }
}