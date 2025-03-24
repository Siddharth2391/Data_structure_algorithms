class Solution {
    public void pattern10(int n) {
        int v = 1, flag = 0;
        for (int i = 0; i < (n * 2) - 1; i++) {
            if (flag == 0) {
                for (int j = 0; j < v; j++) {
                    System.out.print("*");
                }
                System.out.println();
                v++;
                if (v == n) {
                    flag = 1;
                }
            } else {

                for (int j = 0; j < v; j++) {
                    System.out.print("*");
                }
                System.out.println();
                v--;
            }
        }

    }
}

/*
 * Pattern 10
 * 
 **
 ***
 ****
 *****
 ****
 ***
 **
 *
 * END
 */
