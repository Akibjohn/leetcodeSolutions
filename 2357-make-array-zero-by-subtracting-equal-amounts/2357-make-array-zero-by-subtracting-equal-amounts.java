class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i: nums){
            if(i!=0) hs.add(i);
        }
        return hs.size();
    }
}