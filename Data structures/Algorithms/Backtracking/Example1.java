//Generate all the binary strings of N bits

class Example1{
    int a[];
    public Example1(int n){
        a=new int[n];
    }
    
    public void  binary(int n){
        if(n<=0){
            System.out.println(Arrays.toString(a));
        }else{
            a[n-1]=0;
            binary(n-1);
            a[n-1]=1;
            binary(n-1);
        }
    }
    
    public static void main(String[] args) {
       int n=2;
       Example1 obj=new Example1(n);
       obj.binary(n);
    }
}
