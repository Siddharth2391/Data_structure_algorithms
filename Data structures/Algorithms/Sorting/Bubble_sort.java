class Bubble_sort {
    public static void main(String[] args) {
        int a[]={1,21,3,44,52,16};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]<=a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}
