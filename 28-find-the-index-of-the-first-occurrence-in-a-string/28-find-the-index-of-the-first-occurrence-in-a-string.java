class Solution {
    public boolean check(String s,String p, int i){
        int j=0;
        while(j<p.length() && i<s.length()){
            if(s.charAt(i) != p.charAt(j)){
                return false;
            }
            i++;
            j++;
        }
        return j==p.length();
    }
    public int strStr(String s, String p) {
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)==p.charAt(0)){
                if(check(s,p,i)){
                    return i;
                }
            }
            i++;
        }
        return -1;
    }
}