// Approach 1 
import java.util.*;
class Array {
    public static void main(String[] args) {
        int a[]={1,423,6,46,34,23,13,53,4}; 
        Arrays.sort(a);
        System.out.println("min-"+a[0]+" max-"+a[a.length-1]);
    }
}


//Approach 2
import java.util.*;
class Array {
    public static void main(String[] args) {
        int a[]={45,23,3,523,5,532,24,12,423};
        int min=a[0];
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Min- "+min+" Max- "+max);
    }
}


//Approach 3
