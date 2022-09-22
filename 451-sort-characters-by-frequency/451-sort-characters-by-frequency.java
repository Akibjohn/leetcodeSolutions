class Solution {
    public String frequencySort(String str) {
        HashMap<Character , Integer> hm = new HashMap<>();
        StringBuilder sb =new StringBuilder();
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(char ch: str.toCharArray()) hm.put(ch,hm.getOrDefault(ch,0)+1);
        for(char ch: hm.keySet()) pq.add(new Pair(ch,hm.get(ch)));
        while(!pq.isEmpty()){
            Pair rv=pq.remove();
            for(int i=0;i<rv.f;i++) sb.append(rv.ch);
        }
        return sb.toString();
    }
    
    class Pair implements Comparable<Pair>{
        int f;
        char ch;
        Pair(char ch, int f){
            this.ch=ch;
            this.f=f;
        }
        
        public int compareTo(Pair other){
            return other.f - this.f;
        }
        
    }
}