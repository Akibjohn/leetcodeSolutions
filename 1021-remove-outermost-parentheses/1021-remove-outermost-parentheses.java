class Solution {
    public String removeOuterParentheses(String str) {
        StringBuilder sb= new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(char ch: str.toCharArray()){
            if(ch=='(' && !st.isEmpty() || st.size()>1) sb.append(ch);
            if(ch=='(') st.push(ch);
            else st.pop();
        }
        return sb.toString();
        
    }
}