class Stack{
    int data;
    int top;
    int a[];
    int size;
    
    Stack(int size){
        this.size=size;
        a=new int[size];
        top=-1;
    }
    
    int size(){
        return this.size;
    }
    
    int peek(){
        return a[top];
    }
    
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    
    boolean isFull(){
        if(top==size-1){
            return true;
        }
        return false;
    }
    
    void push(int data){
        if(isFull()){
            System.out.println("Stack overflow");
        }else{
            a[++top]=data;
        }
    }
    
    void pop(){
        if(isEmpty()){
            System.out.println("Underflow");
        }else{
            top--;
        }
    }
    
}

class Test {
    public static void main(String[] args) {
        Stack s=new Stack(10);
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(100);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
       
    }
}
