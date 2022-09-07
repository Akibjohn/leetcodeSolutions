class Solution {
   public boolean isVowel(char c){
        if(c == 'a' || c=='e' || c=='i'|| c=='o'||c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            return true;
        return false;
    }
    public String reverseVowels(String str) {
        char[] arr=str.toCharArray();
        int j=arr.length-1;
        int i=0;
        while(i<j){
            
            while(i<arr.length && !isVowel(arr[i])){
                i++;
            }
            while(j>=0 && !isVowel(arr[j])){
                j--;
            }
            if(i>j) break;
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }
        return String.valueOf(arr);
        
    }
} 