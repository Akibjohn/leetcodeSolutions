class Solution {
    public void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void moveZeroes(int[] nums) {
        int itr=0;
        int p=0;
        while(itr<nums.length){
            if(nums[itr]!=0){
                swap(nums,itr++,p++);
            }else{
                itr++;
            }
        }
        
    }
}