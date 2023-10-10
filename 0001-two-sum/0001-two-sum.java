class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<nums.length;i++) hm.put(nums[i],i);
        
        for(int i=0;i<nums.length;i++){
            int complemet=target-nums[i];
            if(hm.containsKey(complemet) && hm.get(complemet)!=i){
                ans[0]=i;
                ans[1]=hm.get(complemet);
            }
        }
        
        
        
        
        
        return ans;
        
    }
}