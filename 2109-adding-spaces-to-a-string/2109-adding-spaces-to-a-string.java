class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        int len=0;
        while(i<s.length()){
            if(len<spaces.length && i==spaces[len]){
                sb.append(" ");
                len++;
            }
            sb.append(s.charAt(i));
            i++;
        }
        return sb.toString();
    }
}