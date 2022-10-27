// Unoptimize approach        O(n^2)
class Test {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5}; // 5 4 3 2 1
        int n=a.length;
        for(int j=0;j<n;j++){
            int temp=a[n-1];
            for(int i=n-2;i>=j;i--){
                a[i+1]=a[i];
            }
            a[j]=temp;
           
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}

//Optimize way        O(log n)
class Test {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9}; // 5 4 3 2 1
        int n=a.length;
        int s=0, e=n-1;
        for(int i=0;i<n/2;i++){
            int temp1=a[s],temp2=a[e];
            a[e]=temp1;
            a[s]=temp2;
            s+=1;
            e-=1;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
