class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        // potential answer
        int ans = nums[0] + nums[1] + nums[2];
        // 3-sum code
        for(int i=0;i<nums.length-2;i++){
            int si = i+1;
            int ei = nums.length-1;
            while(si < ei){
                int sum = nums[i] + nums[si] + nums[ei];
                if(sum > target){
                    ei--;
                }
                else{
                    si++;
                }
                if(Math.abs(target-sum) < Math.abs(target-ans)){
                    ans = sum;
                }
            }
        }
        return ans;
    }
}