class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr=s.split(" ");
        if(pattern.length()!=arr.length) return false;
        HashMap<Character,String> hm=new HashMap<>();
        HashMap<String,Boolean> hm1=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            char ch=pattern.charAt(i);
            if(hm.containsKey(ch)){
                if(!hm.get(ch).equals(arr[i])){
                    return false;
                }
            }
            else{
                if(hm1.containsKey(arr[i])==true){
                    return false;
                }else{
                hm.put(ch,arr[i]);
                hm1.put(arr[i],true);
                }
            }
        }
        
        return true;
    }
}