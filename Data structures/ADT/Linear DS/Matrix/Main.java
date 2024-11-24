import java.util.*;

public class Main {
  
    public static void main(String[] args) {
      
      int arr[][]={{1,2},{3,4}};//{5,6,7,8},{9,10,11,12},{13,14,15,16}};
      int n=arr.length;
       for(int i=0;i<n;i++){
        for(int j=0;j<arr[0].length;j++){
          System.out.print(arr[i][j]+"\t");
        }
        System.out.println();
      }
      
      System.out.println("_________________________________");
      
      
      
      for(int i=0;i<n;i++){
        for(int j=0;j<arr.length;j++){
          System.out.print("Current Index "+arr[i][j]);
          if((i==0 && j==n-1) || (i==n-1 && j==0) || ((i==0 && j==0) || (i==n-1 && j==n-1))){ //2A
            System.out.print(" 2 Adj. \n");
          }else if( ((j==0 || j==n-1) && i>0) || ( (i==0 || i==n-1) && j >0 ) ){ //3A
            System.out.print(" 3 Adj. \n");
          }else{ //4A
            System.out.print(" 4 Adj. \n");
          }
        }
        System.out.println();
      }
  }
}