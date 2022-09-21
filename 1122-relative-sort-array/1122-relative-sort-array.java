class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq=new int[1001];
        ArrayList<Integer> al=new ArrayList<>();
        for(int i: arr1) freq[i]++;
        for(int i=0;i<arr2.length;i++){
            while(freq[arr2[i]]!=0){
                al.add(arr2[i]);
                freq[arr2[i]]--;
            }
        }
        for(int i=0;i<freq.length;i++){
            while(freq[i]!=0){
                al.add(i);
                freq[i]--;
            }
        }
        int idx=0;
        int[] ans=new int[al.size()];
        for(int i: al) ans[idx++]=i;
        
        return ans;
        
    }
}