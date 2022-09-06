class Solution {
    
    public int longestBeautifulSubstring(String word) {
        String str="a";
        word+=str;
        char[] arr=word.toCharArray();
        
        HashMap<Character, Integer> hm = new HashMap<>();
        int len=0;
        int maxLen=0;
        for(int i=0;i<arr.length-1;i++) {
            if(i==0 ||  hm.isEmpty()){
                hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
            }
            if(arr[i]<=arr[i+1] ){
                hm.put(arr[i+1], hm.getOrDefault(arr[i+1], 0) + 1);
            }else{
                if(hm.size()==5){
                    for (int val : hm.values()) {
                        len += val;
                    }
                }
                maxLen=Math.max(maxLen,len);
                hm.clear();
                len=0;
            }
        }
        
        
       
        return maxLen;
    }
}