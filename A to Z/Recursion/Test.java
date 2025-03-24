class Solution {

    public boolean check(String str){
        int s=0,e=str.length()-1;
        while(s<=e){
            if(str.charAt(s++)!=str.charAt(e--)){
                return false;
            }
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String temp=s.substring(i,j+1); 
                if(str.length() < temp.length()){ 
                    if(check(temp)){
                        str=temp; // bab 
                    }
                }
                
            }
        }
        return str;
    }
}