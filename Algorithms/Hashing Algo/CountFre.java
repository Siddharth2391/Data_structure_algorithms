
public class CountFre {

    // Time complexity for Q queries will be O(Qxn)
    public static int count(int arr[], int x) {
        int cnt = 0;
        for (int i : arr) {
            if (i == x) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 1, 2, 4, 4, 5, 2, 11, 2, 4, 13, 5 };
        System.out.println("Count of 1:" + count(arr, 1));

        // Hashing - O(n)
        int freq[] = new int[20];
        for (int i : arr) {
            freq[i]++;
        }
        System.out.println("Count of 5:" + freq[5]);

    }
}
