class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer ,Integer> hm=new HashMap<>();
        for(int i: nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int key: hm.keySet()){
            if(hm.get(key)>1)
                return key;
        }
        return -1;
        
    }
}