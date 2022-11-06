class Solution {
    public boolean isPalindrom(String str, int si, int ei){
        while(si<ei){
            if(str.charAt(si)!=str.charAt(ei)) return false;
            si++;
            ei--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        boolean flag1=true;
        boolean flag2=true;
        int i=0,n=s.length()-1;
        while(i<n){
            if(s.charAt(i)!=s.charAt(n)){
                flag1=isPalindrom(s,i+1,n);
                flag2=isPalindrom(s,i,n-1);
                break;
            }
            i++;
            n--;
        }
        if(flag1==true || flag2==true) return true;
        else return false;
        
    }
}