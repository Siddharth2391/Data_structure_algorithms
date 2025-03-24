/* Pattern 11
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1
END */

// V2 - Neat and Clean
public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        int p = 0;
        for (int i = 0; i < n; i++) {
            p = (i % 2 == 0) ? 1 : 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(p + " ");
                p = (p == 1) ? 0 : 1;
            }
            System.out.println();
        }
    }
}

// V1
class Solution {
    public void pattern11(int n) {
        int e = 1, o = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i % 2 == 0) {
                    if (e == 1) {
                        System.out.print("1 ");
                        e = 0;
                    } else {
                        System.out.print("0 ");
                        e = 1;
                    }
                } else {
                    if (o == 1) {
                        System.out.print("1 ");
                        o = 0;
                    } else {
                        System.out.print("0 ");
                        o = 1;
                    }
                }
            }
            e = 1;
            o = 0;
            System.out.println();
        }
    }
}
