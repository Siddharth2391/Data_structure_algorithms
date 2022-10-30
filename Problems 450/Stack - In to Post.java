import java.util.*;

class PostExp {
    public static int pre(char c){
        if(c=='*' || c=='/'){
            return 2;
        }
        if(c=='+' || c=='-'){
            return 1;
        }
        return 0;
    }
    
    public static void inToPost(String str){
        Stack<Character> s=new Stack();
        String post="";
        for(int i=-0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLetter(c)){
                post+=c;
            }else if(c==')' && s.isEmpty()){
                System.out.println("Invalid");
                break;
            }else{
                if(c=='('){
                    s.push(c);
                }else if(c==')'){
                     while(s.peek()!='('){
                         post+=s.pop();
                     }   
                     s.pop();
                }else if(c=='+' || c=='/' || c=='*' || c=='-'){
                    if(s.empty()){
                       s.push(c); 
                    }else{
                        char p=s.peek();
                        if(pre(p)<pre(c)){
                            s.push(c);
                        }else if(pre(p)>=pre(c)){
                                post+=s.pop();
                                s.push(c);
                        }
                    }
                    
                }
            }
        }
        while(!s.isEmpty()){
            post+=s.pop();
        }
        System.out.println(post);
    }
    
    public static void main(String[] args) {
        String str="(A+B)*C-(D-E)*(F+G)";
        // String str="(A+B)*C-D";
        inToPost(str);
    }
}
