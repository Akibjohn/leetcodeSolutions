class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> hm =new HashMap<>();
        for(int i: nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int key : hm.keySet()){
            if(hm.get(key)>n/2) return key;
        }
        return -1;
    }
}