class Solution {
    public boolean palindrom(String str , int i , int j){
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)){
                return palindrom(str, i+1 ,j) || palindrom(str, i ,j-1);
            }
            i++;
            j--;
        }
        return true;
    }
}