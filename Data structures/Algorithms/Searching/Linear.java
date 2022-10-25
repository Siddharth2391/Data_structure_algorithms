// time complexity is O(n)

class Linear {
    public static void main(String[] args) {
        int a[]={1,21,3,44,52,16};
        int key=444; // searching element
        int flag=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                flag=1;
                break;
            }
        }
        
        if(flag==1){
            System.out.println("Element found");
        }else{
            System.out.println("Element Not found");
        }
        
    }
}
