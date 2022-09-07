class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i: nums){
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        for(int key: hm.keySet()){
            if(hm.get(key)>1){
                al.add(key);
            }
        }
        
        return al;
    }
}