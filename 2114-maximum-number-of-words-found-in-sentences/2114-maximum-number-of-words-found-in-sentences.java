class Solution {
    public int mostWordsFound(String[] sentences) {
        int word=1;
        int maxWord=0;
        for(int i=0;i<sentences.length;i++){
            String[] str=sentences[i].split(" ");
            maxWord=Math.max(maxWord,str.length);
        }
        return maxWord;
    }
}