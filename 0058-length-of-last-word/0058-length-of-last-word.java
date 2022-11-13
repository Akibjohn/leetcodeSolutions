class Solution {
    public int lengthOfLastWord(String s) {
        // String[] arr=s.split(" ");
        int ans=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!=' ') ans++;
            else if(ans!=0){
                break;
            }
        }
        return ans;
    }
}