class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> hm= new HashMap<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int i: nums) hm.put(i,hm.getOrDefault(i,0)+1);
        for(int key: hm.keySet()) pq.add(new Pair(key,hm.get(key)));
        while(pq.size()>k) pq.remove();
        int[] ans = new int[pq.size()];
        int idx=0;
        while(!pq.isEmpty()){
            Pair remove=pq.remove();
            ans[idx++]=remove.key;
        }
        return ans;
    }
    class Pair implements Comparable<Pair>{
        int key;
        int value;
        Pair(int key, int value){
            this.key=key;
            this.value=value;
        }
        
        public int compareTo(Pair other){
            return this.value - other.value;
        }
        
    }
}