class Solution {
    public String removeOuterParentheses(String str) {
        StringBuilder sb= new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(char ch: str.toCharArray()){
           if(ch=='('){
               if(st.size()>=1) sb.append(ch);
               st.push(ch);
           }else{
               if(st.size()>1) sb.append(ch);
               st.pop();
           }
        }
        return sb.toString();
        
    }
}