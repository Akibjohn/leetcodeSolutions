class Solution {
    public int longestContinuousSubstring(String s) {
        int ans=0, len=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)-1){
                len++;
                
            }else{
                ans=Math.max(len,ans);
                len=1;
            }
        }
        if(len>ans) return len;
        return ans;
        
    }
}