class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        int[] freq=new int[1001];
        for(int i: nums1){
            freq[i]++;
        }
        for(int i: nums2){
            if(freq[i]>0){
                hs.add(i);
            }
        }
        int[] ans=new int[hs.size()];
        int idx=0;
        for(int i: hs){
            ans[idx++]=i;
        }
        return ans;
    }
}