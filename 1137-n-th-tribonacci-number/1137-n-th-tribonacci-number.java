class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        
        if(map.containsKey(n)){
            return map.get(n);
        }
        int faith1 = tribonacci(n-1);
        int faith2 = tribonacci(n-2);
        int faith3 = tribonacci(n-3);
        map.put(n,faith1+faith2+faith3);
        return faith1+faith2+faith3;
    }
}