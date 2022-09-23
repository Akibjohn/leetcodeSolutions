class Solution {
    public int minSteps(String s, String t) {
        int[] arr=new int[26];
        int i=0;
        int j=0;
        while(i<s.length()){
            arr[s.charAt(i++)-'a']++;
        }
        while(j<t.length()){
            arr[t.charAt(j++)-'a']--;
        }
        int ans=0;
        for(int val:arr ){
            if(val>0 || val<0){
                ans+=Math.abs(val);
            }
        }
        return ans;
    }
}