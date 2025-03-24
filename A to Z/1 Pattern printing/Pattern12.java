/*
Pattern 11

1        1
12      21
123    321
1234  4321
1234554321

END
 */

class Solution {
    public void pattern12(int n) {
        int p = 1;
        for (int i = 0; i < n; i++) {
            // 1st half
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print(p + "");
                    p++;
                } else {
                    System.out.print(" ");
                }
            }
            // 2nd half
            p--;
            for (int j = n - 1; j >= 0; j--) {
                if (j <= i) {
                    System.out.print(p + "");
                    p--;
                } else {
                    System.out.print(" ");
                }
            }
            p = 1;
            System.out.println();
        }
    }
}
