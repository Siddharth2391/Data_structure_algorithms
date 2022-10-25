class Array_rotation_right {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int d=4;
        while(d-->0){
            int temp=a[a.length-1];
            for(int i=a.length-2;i>=0;i--){
                a[i+1]=a[i];
            }
            a[0]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

