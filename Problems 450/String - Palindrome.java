class Stringg {
    public static void main(String[] args) {
        String str="Siddharth";
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        if(str1.equals(str)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
