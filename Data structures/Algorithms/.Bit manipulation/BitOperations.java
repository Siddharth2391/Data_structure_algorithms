import java.util.*;

class BitOperations {
    
    public static int get(int n,int i){
        int bitmask=(1<<i);
        if( (n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    
    public static void main(String[] args) {
        // 5 -> 0101
        // 15--> 1111
        System.out.println("3rd bit of 15 (1111) is "+get(15,3)); //
        System.out.println("1st bit of 5 (0101) is "+get(5, 1));
    }
}
