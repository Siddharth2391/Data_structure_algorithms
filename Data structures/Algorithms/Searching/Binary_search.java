// time complexity is O(log n)
import java.util.*;

class Binary_search {
    public static void main(String[] args) {
        int a[]={1,21,3,44,52,16};
        int key=21; // searching element
        int flag=0,f=0,l=a.length-1,mid=0;
        // array need to be sorted in order to search
        Arrays.sort(a);
        while(f<=l){
            mid=(f+l)/2;
            
            if(a[mid]==key){
                flag=1;
                break;
            }
            
            if(a[mid]<=key){
                f=mid+1;
            }
            
            if(a[mid]>=key){
                l=mid-1;
            }
        }
        
        if(flag==1){
            System.out.println("Element found");
        }else{
            System.out.println("Element Not found");
        }
        
    }
}
