class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int n=nums.length;
        for(int i=0;i<=n+1;i++){
            if(!hm.containsKey(i)) return i;
        }
        return -1;
        
    }
}