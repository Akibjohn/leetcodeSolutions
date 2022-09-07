class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] arr=new int[nums.length+1];
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            char ch=(char)nums[i];
            arr[ch]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1){
                al.add(i);
            }
        }
        
        
        return al;
    }
}