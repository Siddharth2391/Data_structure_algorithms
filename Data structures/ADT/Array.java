import java.util.*;
class Array {
    public static void main(String[] args) {
        int a[]=new int[10];
        Scanner ss=new Scanner(System.in);
        
        //inseration in array
        for(int i=0;i<5;i++){
            a[i]=ss.nextInt();
        }
        
        //Traversal in array
        System.out.println("Traversal in array :");
        for(int i=0;i<5;i++){
            System.out.print(a[i]+" ");
        }
        
        //Deletion in array
        System.out.println("Deletion in array :");
        for(int i=0;i<4;i++){
            System.out.print(a[i]+" ");
        }
    }
}
