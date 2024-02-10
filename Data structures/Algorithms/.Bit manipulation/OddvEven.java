// Write program to check number is odd or even using bit manipulation

import java.util.*;

class OddvEven {
    
    public static int check(int n){
        return (n&1);
    }
    
    public static void main(String[] args) {
        int n=10;
        if(check(n)==1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
}
