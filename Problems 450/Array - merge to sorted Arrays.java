import java.util.*;

class Array{
    
    public static void merge(int a[],int b[],int n1,int n2){
        int c[]=new int[n1+n2];
        int i=0,j=0,x=0;
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                c[x++]=a[i++];
            }else{
                c[x++]=b[j++];
            }
        }
        while(i<n1){
            c[x++]=a[i++];
        }
        while(j<n2){
            c[x++]=b[j++];
        }
        
        for(int m=0;m<c.length;m++){
            System.out.print(c[m]+" ");
        }
    }
    
    public static void main(String args[]){
        int a[]={1,3,5,7};
        int b[]={2,4,6,8};
        int n1=a.length;
        int n2=b.length;
        merge(a,b,n1,n2);
    }
}
