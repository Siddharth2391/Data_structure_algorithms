// print any 1 subseq whose sum is target

import java.util.*;

public class Main {

    public static boolean subseq(int arr[], ArrayList<Integer> al, int i, int sum, int s) {
        if (i == arr.length) {
            if (sum == s) {
                System.out.println(al);
                return true;
            } else {
                return false;
            }
        }
        al.add(arr[i]);
        s += arr[i];
        if (subseq(arr, al, i + 1, sum, s) == true) {
            return true;
        }
        al.remove(al.size() - 1);
        s -= arr[i];
        if (subseq(arr, al, i + 1, sum, s) == true) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        ArrayList<Integer> al = new ArrayList<>();
        int sum = 10;
        subseq(arr, al, 0, sum, 0);
    }
}