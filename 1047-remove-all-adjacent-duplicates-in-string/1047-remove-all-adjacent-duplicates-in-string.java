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
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        
        
        return sb.reverse().toString();
    }
}