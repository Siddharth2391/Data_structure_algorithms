//A-1         O(n)
import java.util.*;
class Test {
    public static void main(String[] args) {
        Stack<Character> s=new Stack();
        String str="Siddharth";
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        String rev="";
        for(int i=0;i<str.length();i++){
            rev+=s.pop();
        }
        System.out.println(rev);
    }
}
