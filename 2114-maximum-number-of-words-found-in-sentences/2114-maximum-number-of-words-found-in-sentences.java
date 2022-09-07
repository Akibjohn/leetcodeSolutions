class Solution {
    public int mostWordsFound(String[] sentences) {
        int word=1;
        int maxWord=0;
        for(int i=0;i<sentences.length;i++){
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    word++;
                }
                maxWord=Math.max(maxWord,word);
            }
            word=1;
        }
        return maxWord;
    }
}