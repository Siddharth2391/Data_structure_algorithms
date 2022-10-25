
class Recursion1 {
    public static int sum(int n){
        if(n==0){
            return 1;
        }
        return 7+sum(n-2);
    }
    public static void main(String[] args) {
       System.out.println(sum(4));
    }
}
