class Solution {
    
    public int maximumProduct(int[] arr) {
        int n=arr.length;
        int i=0;
        Arrays.sort(arr);
        int rightProduct=arr[n-1]*arr[n-2]*arr[n-3];
        int leftProduct=arr[i]*arr[i+1]*arr[n-1];
        int maxProduct=Math.max(rightProduct,leftProduct);
        return maxProduct;
        
    }
}