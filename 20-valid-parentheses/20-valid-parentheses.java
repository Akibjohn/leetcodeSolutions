class Solution {
    public boolean isValid(String str) {
        Stack<Character> st=new Stack<>();
        for(char ch: str.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '[' ){
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;
                else if(st.peek()=='(' && ch!=')') return false;
                else if(st.peek()=='{' && ch!='}') return false;
                else if(st.peek()=='[' && ch!=']') return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
}