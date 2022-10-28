import java.util.*;
class Test {
    
    public static int check(String str){
        Stack<Character> s=new Stack();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                s.push(c);
            }else if(c==')' || c==']' || c=='}'){
                if(s.isEmpty()){
                    return 0;
                }else{
                    char p=s.peek();
                    switch(p){
                        case '(': if(c==']' || c=='}')
                                    return 0;
                                    break;
                        case '[': if(c==')' || c=='}')
                                    return 0;
                                    break;
                        case '{': if(c==']' || c==')')
                                    return 0;
                                    break;
                    }
                }
                s.pop();
            }
        }
        if(s.empty()){
            return 1;
        }else{
           return 0;
        }
        
    }
    
    public static void main(String[] args) {
        String str="([{])";
        System.out.println();
        if(check(str)==0){
             System.out.println("Invalid");
        }else{
             System.out.println("Valid");
        }
    }
}
