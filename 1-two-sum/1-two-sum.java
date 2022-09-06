class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm =new HashMap<>();
        int[] arr=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++) hm.put(nums[i], i);
        for(int i=0;i<n;i++){
            int complement=target-nums[i];
            if(hm.containsKey(complement) && hm.get(complement)!=i ){
                
                arr[0]=i;
                arr[1]=hm.get(complement);
                return arr;
            }
        }
        return arr;
        
    }
}