class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> al=new ArrayList<>();
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++) freq[s.charAt(i)-'a']=i;
        int maxlength=0;
        int tempLength=-1;
        for(int i=0;i<s.length();i++){
            maxlength=Math.max(maxlength,freq[s.charAt(i)-'a']);
            if(maxlength == i) {
                
                al.add(maxlength-tempLength);
                tempLength=maxlength;
            }
            
        }
        // if(maxlength>tempLength) al.add(maxlength-tempLength);
        return al;
    }
}