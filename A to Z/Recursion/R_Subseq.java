import java.util.*;

public class R_Subseq {

    public static void sub(int arr[], int i, ArrayList<Integer> al) {
        if (i == arr.length) {
            System.out.println(al);
            return;
        }
        al.add(arr[i]);
        sub(arr, i + 1, al); // take
        al.remove(al.size() - 1);
        sub(arr, i + 1, al); // not take
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1 };
        ArrayList<Integer> al = new ArrayList<>();
        sub(arr, 0, al);
    }
}