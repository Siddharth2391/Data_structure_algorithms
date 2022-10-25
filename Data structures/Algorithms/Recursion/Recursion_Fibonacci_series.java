// non-optimize way
class Recursion1 {
    public static long fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
     
    public static void main(String[] args) {
        int n=30;
        for(int i=0;i<=n;i++){
             System.out.print(fibo(i)+" ");
        }
       
    }
}



// Optimize approach
class Recursion1 {

     public static long fiboc[];

    public static long fibo(int n){
        if(n<=1){
            return n;
        }
        if(fiboc[n]!=0){
            return fiboc[n];
        }
        long nthfib=fibo(n-1)+fibo(n-2); 
        fiboc[n]=nthfib;
        return nthfib;
    }
    public static void main(String[] args) {
        int n=30;
        fiboc=new long[n+1];
        for(int i=0;i<=n;i++){
             System.out.print(fibo(i)+" ");
        }
       
    }
}
