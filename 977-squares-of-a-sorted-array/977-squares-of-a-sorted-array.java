class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int i=0,j=n-1;
        int[] ans=new int[n];
        for(int k=n-1;k>=0;k--){
            if(Math.abs(nums[i])<Math.abs(nums[j])){
                ans[k]=nums[j]*nums[j];
                j--;
                
            }else{
                ans[k]=nums[i]*nums[i];
                i++;
            }
        }
        return ans;
    }
}