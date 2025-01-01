// print subseq whose sum equals to target sum

import java.util.ArrayList;

public class Main {

    public static void subseq(int arr[], ArrayList<Integer> al, int i, int sum, int s) {
        if (i == arr.length) {
            if (sum == s) {
                System.out.println(al);
            }
            return;
        }
        al.add(arr[i]);
        s += arr[i];
        subseq(arr, al, i + 1, sum, s);
        al.remove(al.size() - 1);
        s -= arr[i];
        subseq(arr, al, i + 1, sum, s);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        ArrayList<Integer> al = new ArrayList<>();
        int sum = 10;
        subseq(arr, al, 0, sum, 0);
    }
}