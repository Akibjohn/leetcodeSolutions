class Solution {
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sortColors(int[] arr) {
        int pt1 = -1, itr = 0, n = arr.length, pt2 = n - 1;
        while (itr <=pt2) {
            if (arr[itr] == 0) {
                swap(arr, ++pt1, itr++);
            } else if (arr[itr] == 1) {
                itr++;
            } else if (arr[itr] == 2) {
                swap(arr, itr, pt2--);
            }

           
        }
        
    }
}