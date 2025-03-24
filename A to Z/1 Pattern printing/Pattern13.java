/*
Pattern 13

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15

END
 */

class Solution {
    public void pattern13(int n) {
        int p = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((p++) + " ");
            }
            System.out.println();
        }
    }
}