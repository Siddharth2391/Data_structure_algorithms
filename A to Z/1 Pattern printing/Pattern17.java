/*
Pattern 17
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

*/

class Solution {
    public void pattern17(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            // 1st half
            for (int j = n - 1; j >= 0; j--) {
                if (j <= i) {
                    System.out.print(ch);
                    ch++;
                } else {
                    System.out.print(" ");
                }
            }

            ch--;
            ch--;
            // 2nd Half
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
            ch = 'A';
        }
    }
}
