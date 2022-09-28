class Solution {
    public void swap(int[] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int[] sortedSquares(int[] arr) {
        int n= arr.length;
        for(int i=0;i<n;i++){
            arr[i]=arr[i]*arr[i];
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
            }
        }
        return arr;
    }
}