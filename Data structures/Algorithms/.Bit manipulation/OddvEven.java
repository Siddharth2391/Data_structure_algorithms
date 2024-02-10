// Write program to check number is odd or even using bit manipulation

import java.util.*;

class OddvEven {
    
    public static void check(int n){
        if((n&1) == 1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
    
    public static void main(String[] args) {
        check(10);
        check(11);
    }
}
