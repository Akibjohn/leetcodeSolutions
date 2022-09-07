class Solution {
    
    public int maximumProduct(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int leftProduct=arr[0]*arr[1]*arr[n-1];
        int rightProduct=arr[n-1]*arr[n-2]*arr[n-3];
        int ans=Math.max(leftProduct,rightProduct);
        return ans;
        
    }
}