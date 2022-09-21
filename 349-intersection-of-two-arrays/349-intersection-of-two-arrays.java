class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        int n1=arr1.length;
        int n2=arr2.length;
        HashMap<Integer, Integer> hm1=new HashMap<>();
        HashMap<Integer, Integer> hm2=new HashMap<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i : arr1){
            hm1.put(i,hm1.getOrDefault(i,0)+1);
        }
        for(int i : arr2){
            hm2.put(i,hm2.getOrDefault(i,0)+1);
        }
        for(int i : arr1){
            if(hm2.containsKey(i)){
                hs.add(i);
            }
        }
        int[] ans=new int[hs.size()];
        int idx=0;
        for(int i:hs){
            ans[idx++]=i;
        }
        
        
        return ans;
    }
}