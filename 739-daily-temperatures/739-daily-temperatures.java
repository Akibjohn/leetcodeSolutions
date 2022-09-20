class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int[] result = new int[arr.length];
        
        for (int day = arr.length - 1; day >= 0; day--){
           for (int i = day - 1; i >= 0 && arr[i] < arr[day]; i--){
               result[i] = day - i; 
           } 
                
        }
            
                
        return result;
    }
}