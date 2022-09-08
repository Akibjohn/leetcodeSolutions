class Solution {
    public String removeDuplicates(String str) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }else if(st.peek()!=ch){
                st.push(ch);
            }
            else if(st.peek()==ch){
                st.pop();
            }
        }
        for(Character ch:st){
            sb.append(ch);
        }
        
        
        
        return sb.toString();
    }
}