/*
Pattern 14

A
AB
ABC
ABCD
ABCDE

END
*/
class Solution {
    public void pattern14(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            ch = 'A';
        }
    }
}