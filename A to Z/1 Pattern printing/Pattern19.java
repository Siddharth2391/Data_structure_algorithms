/* 
Pattern 19

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

END
*/

//v1
class Solution {
    public void pattern19(int n) {
        // Upper side
        for (int i = 0; i < n; i++) {
            // star
            for (int j = n - 1; j >= i; j--) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower side
        for (int i = n - 1; i >= 0; i--) {
            // star
            for (int j = 0; j < (n - i); j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
