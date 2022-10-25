class Arrays_Left_rotation {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int d=4;
        while(d-->0){
            int temp=a[0];
            for(int i=0;i<a.length-1;i++){
                a[i]=a[i+1];
            }
            a[a.length-1]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

