class Solution {
    public int mostFrequentEven(int[] nums) {
        // int[] freq =new int[1000001];
        HashMap<Integer , Integer> hm= new HashMap<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int i: nums){
            if(i%2==0){
                hm.put(i,hm.getOrDefault(i,0)+1);
            }
        }
        if(hm.isEmpty()) return -1;
        for(int key: hm.keySet()) pq.add(new Pair(key, hm.get(key)));
        Pair ans =pq.remove();
        return ans.key;
    }
    class Pair implements Comparable<Pair>{
        int key;
        int value;
        Pair(int key, int value){
            this.key=key;
            this.value=value;
        }
        
        public int compareTo(Pair other){
            if(this.value==other.value){
                return this.key - other.key;
            }else if(other.value > this.value){
                return other.key;
            }
            return -1;
        } 
    }
}