class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        List<Integer> sortedList = new ArrayList<>(hs);
        Collections.sort(sortedList);
        int idx=0;
        for(int val: sortedList ){
            nums[idx++]=val;
        }
        
        return hs.size();
        
        
    }
}