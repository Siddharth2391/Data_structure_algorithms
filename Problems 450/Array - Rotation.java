// Unoptimize       O(n^2)
//right rotaion
class Array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5}; // 5 4 3 2 1
        int n=a.length;
        int t=3;
        while(t-->0){
            int temp=a[0];
            for(int i=0;i<n-1;i++){
                a[i]=a[i+1];
            }
            a[n-1]=temp;
           
        }
        
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        
    }
}
}

//Left rotation             O(n^2)
class Array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5}; // 5 4 3 2 1
        int n=a.length;
        int t=3;
        while(t-->0){
            int temp=a[n-1];
            for(int i=n-2;i>=0;i--){
                a[i+1]=a[i];
            }
            a[0]=temp;
           
        }
        
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        
    }
}
}
