class Solution {
    public int find(int[] arr){
        int si=0;
        int ei=arr.length-1;
        int ans=-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(arr[mid]==0){
                si=mid+1;
            }else{
                ans=mid;
                ei=mid-1;
            }
        }return ans;
    }
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        while(nums[nums.length-1]!=0){
            count++;
            int idx=find(nums);
            int value=nums[idx];
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    nums[i]-=value;
                }
            }
        }
        return count;
        
    }
}