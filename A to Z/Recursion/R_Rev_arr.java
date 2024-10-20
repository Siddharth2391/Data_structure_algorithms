public class R_Rev_arr {
    public static void rev(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        rev(arr, s + 1, e - 1);
    }

    // Using single variable
    public static void rev1(int arr[], int i) {
        if (i <= (arr.length - 1) / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[(arr.length - 1) - i];
        arr[(arr.length - 1) - i] = temp;
        rev1(arr, i - 1);
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        print(arr);
        // rev(arr, 0, arr.length - 1);
        rev1(arr, arr.length - 1);
        print(arr);
    }
}
