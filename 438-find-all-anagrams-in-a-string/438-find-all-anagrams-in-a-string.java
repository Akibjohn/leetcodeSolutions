class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] fmap = new int[26];
        for(int i=0;i<p.length();i++){
            char ch = p.charAt(i);
            fmap[ch-'a']++;
        }
        for(int i=0;i<=s.length()-p.length();i++){
            int[] map = new int[26];
            boolean isfound = true;
            for(int j=i;j<i+p.length();j++){
                char ch = s.charAt(j);
                map[ch-'a']++;
                if(map[ch-'a'] > fmap[ch-'a']){
                    isfound = false;
                    break;
                }
            }
            if(isfound){
                ans.add(i);
            }
        }
        return ans;
    }
}