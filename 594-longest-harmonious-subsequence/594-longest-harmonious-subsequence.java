class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int key: nums){
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
        int maxFreq=0;
        for(int key:hm.keySet()){
            if(hm.containsKey(key+1)){
                maxFreq=Math.max(maxFreq,hm.get(key)+hm.get(key+1));
                
            }
        }
        return maxFreq;
        
        
        
    }
}