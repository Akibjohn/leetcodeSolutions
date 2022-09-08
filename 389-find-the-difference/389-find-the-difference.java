class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character ,Integer> hms=new HashMap<>();
        HashMap<Character ,Integer> hmt=new HashMap<>();
        for(char c:s.toCharArray()){
            hms.put(c,hms.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            hmt.put(c,hmt.getOrDefault(c,0)+1);
        }
        for(char key:hmt.keySet()){
            if(!hms.containsKey(key)){
                return key;
            }
            else{
                if(hmt.get(key) > hms.get(key)){
                    return key;
                }
            }
        }
        return '0';
        
//         int ans=0;
        
//         for(Character c:t.toCharArray()){
//             ans+=(int)c;
//         }
//         for(Character c:s.toCharArray()){
//             ans-=(int)c;
//         }
        
//         return (char)ans;
        
        
    }
}