class Solution {
    public int minSteps(String s, String t) {
        int[] arr=new int[26];
        for(int i=0,j=0;i<s.length() || j<t.length();i++,j++){
            if(i<s.length()) arr[s.charAt(i)-'a']++;
            if(j<t.length()) arr[t.charAt(i)-'a']--;
        }
        int ans=0;
        for(int val:arr ){
            if(val>0 || val<0){
                ans+=val < 0 ? val*-1 : val;
            }
        }
        return ans;
    }
}