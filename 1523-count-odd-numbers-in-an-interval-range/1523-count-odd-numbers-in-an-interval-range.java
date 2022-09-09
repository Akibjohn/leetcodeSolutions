class Solution {
    public boolean isEven(int low){
        if(low%2==0){
            return true;
        }
        return false;
    }
    public int countOdds(int low, int high) {
        int count=0;
        int i;
        if(isEven(low)){
            i=low+1;
        }else{
            i=low;
        }
        for(int idx=i;i<=high;i+=2){
            count++;
        }
        return count;
        
    }
}