import java.util.*;
class Test {
    
    public static int check(String str){
        Stack<Character> s=new Stack();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='('){
                s.push('(');
            }else if(c==')'){
                if(s.isEmpty()){
                    return 0;
                }else{
                char p=s.peek();
                if(p=='('){
                    s.pop();
                }else{
                    return 0;
                }
                }
            }
        }
        if(s.empty()){
            return 1;
        }else{
           return 0;
        }
        
    }
    
    public static void main(String[] args) {
        String str="()(())()";
        if(check(str)==0){
             System.out.println("Invalid");
        }else{
             System.out.println("Valid");
        }
    }
}
