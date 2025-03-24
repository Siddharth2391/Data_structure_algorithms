/*
Pattern 16

A
BB
CCC
DDDD
EEEEE

END
*/

class Solution {
    public void pattern16(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
}