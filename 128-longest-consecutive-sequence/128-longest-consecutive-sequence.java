class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> hm=new HashMap<>();
        int ans=0;
        for(int n: nums){
            hm.put(n,true);
        }
        for(int n: nums){
            if(hm.containsKey(n-1))
            hm.replace(n,false);
        }
        for(int n: nums){
            int len=1;
            if(hm.get(n)){
                
                while(hm.containsKey(n+len)) len++;
            }
            if(ans<len){
                ans=len;
            }
        }
        return ans;
        
    }
}