class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       ArrayList<Integer> al=new ArrayList<>();
        int[] freq=new int[1001];
        for(int i: nums1){
            freq[i]=1;
        }
        for(int i: nums2){
            if(freq[i]==1){
                al.add(i);
                freq[i]=0;
            }
        }
        int[] ans=new int[al.size()];
        int idx=0;
        for(int i: al){
            ans[idx++]=i;
        }
        return ans;
    }
}