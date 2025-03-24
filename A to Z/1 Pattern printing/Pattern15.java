/*
Pattern 15

ABCDE
ABCD
ABC
AB
A

END
*/

class Solution {
    public void pattern15(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            ch = 'A';
        }
    }
}
