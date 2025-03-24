/*
Pattern 18

E 
D E 
C D E 
B C D E 
A B C D E

END
*/
class Solution {
    public void pattern18(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            ch += (n - i - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            ch = 'A';
            System.out.println();
        }

    }
}
