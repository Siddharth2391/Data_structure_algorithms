//Approach 1
import java.util.*;
class Test {
    static public Stack<Integer> s=new Stack<Integer>();
    static int count=0;
    public static void insert(int data){
        s.push(data);
        count++;
    }
    
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            insert(i);
        }
        System.out.println(count/2);
    }
}
