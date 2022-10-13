class Solution {
    class Pair implements Comparable<Pair>{
        int val;
        int idx;
        Pair(int val, int idx){
            this.val=val;
            this.idx=idx;
            
        }
        public int compareTo(Pair other){
            return this.val - other.val;
        }
    }
    public boolean containsNearbyDuplicate(int[] nums, int target) {
        Pair[] p=new Pair[nums.length];
        for(int i=0;i<nums.length;i++) p[i]=new Pair(nums[i],i);
        
        Arrays.sort(p);
        
        for(int j=1;j<nums.length;j++){
            int i=j-1;
            int k=j;
            if(p[i].val==p[k].val && p[k].idx-p[i].idx<=target) return true;
        }
        return false;
        
    }
}