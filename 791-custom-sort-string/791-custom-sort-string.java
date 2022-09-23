class Solution {
    public String customSortString(String order, String s) {
        StringBuilder ans=new StringBuilder();
        List<Character> al = new ArrayList<>();
        for(char ch :s.toCharArray()) al.add(ch);
        for(int i=0;i<order.length();i++){
            for(int j=0;j<s.length();j++){
                char ch1=order.charAt(i);
                char ch2=s.charAt(j);
                if(ch1==ch2){
                   al.set(j, '0');
                    ans.append(ch1);
                    
                }
            }
        }
        for(char ch : al) {
            if(ch!='0') ans.append(ch);
        }
        return ans.toString();
        
    }
}