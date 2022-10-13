class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new LinkedList<>();
        HashSet<List<Integer>> hs=new HashSet<>();
        int n=nums.length-1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(i==0 || nums[i-1]!=nums[i]){
                int j=i+1,k=n,target=0-nums[i];
                while(j<k){
                    if(nums[j]+nums[k]==target){
                        hs.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        j++;
                        k--;
                    }else if(j<k && nums[j]+nums[k]<target) {
                        j++;
                    }
                    else {
                        k--;
                    }
                    
                }
                
            }
        }
        for(List<Integer> al : hs) ans.add(al);
        return ans;
        
    }
}