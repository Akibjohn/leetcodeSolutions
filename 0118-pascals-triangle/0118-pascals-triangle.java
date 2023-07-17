class Solution {
    public List<List<Integer>> generate(int n) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        List<Integer> list = new ArrayList<>(List.of(1));
        ans.add(list);
        
        int p1=-1;
        int p2=0;
        
        for(int i=1;i<n;i++){
            List<Integer> al = new ArrayList<>();
            
            for(int j=0;j < ans.get(i - 1).size() + 1 ; j++){
                if(p1 < 0 ){
                    al.add(1);
                    
                }else if(p2 >= ans.get(i - 1).size()){
                    al.add(1);
                }
                else{
                    al.add(ans.get(i-1).get(p1) + ans.get(i-1).get(p2));
                }
                p1++;
                p2++;
            }
            ans.add(al);
            p1=-1;
            p2=0;
            
        }
        
        return ans;
        
    }
}