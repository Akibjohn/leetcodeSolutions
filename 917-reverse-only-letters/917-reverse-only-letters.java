class Solution {
    public String reverseOnlyLetters(String str) {
        Stack<Character> st=new Stack<>();
        for(char ch: str.toCharArray()){
            if(ch>='a' && ch<='z') st.push(ch);
            else if(ch>='A' && ch<='Z') st.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(char ch: str.toCharArray()){
            if(ch>='a' && ch<='z') sb.append(st.pop());
            else if(ch>='A' && ch<='Z') sb.append(st.pop());
            else sb.append(ch);
        }
        return sb.toString();
    }
}