class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> hm=new HashMap<>();
        for(String word: strs){
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String str=new String(ch);
            if(!hm.containsKey(str)){
                hm.put(str,new ArrayList<String>());
            }
            hm.get(str).add(word);
        }
        ArrayList<List<String>> ans=new ArrayList<>();
        for(String key: hm.keySet()){
            ans.add(hm.get(key));
        }
        return ans;
        
    }
}