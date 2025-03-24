/*

Pattern 21

*****
*   *
*   *
*   *
*****

END

*/

class Solution {
    public void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == (n - 1)) && (j >= 0 || j <= i)) {
                    System.out.print("*");
                } else if (j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
