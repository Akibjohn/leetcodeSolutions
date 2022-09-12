class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i: stones) pq.add(i);
        while(pq.size()>1){
            int a=pq.remove(),b=pq.remove(),d=a-b;
            if(d!=0){
                pq.add(d);
            }
        }
        return pq.isEmpty()? 0: pq.peek();
        
    }
}