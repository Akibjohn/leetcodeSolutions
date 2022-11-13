class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        int ans=0;
        String str=arr[arr.length-1];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                ans++;
            }
        }
        return ans;
    }
}