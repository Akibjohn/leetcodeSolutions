class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=1;i<s.length();i++){
            char ch1=s.charAt(i-1);
            char ch2=s.charAt(i);
            if(ch1==ch2){
                count++;
            }else{
                count=0;
            }
            if(count<2){
                sb.append(ch1);
            }
            
        }
        sb.append(s.charAt(s.length()-1));
        return sb.toString();
    }
}