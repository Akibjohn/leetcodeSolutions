class Solution {
    public int[] plusOne(int[] arr) {
        int carry = 1;
        int n = arr.length;
        int idx = n-1;
        while(idx >= 0){
            int ele = arr[idx];
            int sum = ele + carry;
            arr[idx] = sum%10;
            carry = sum/10;
            idx--;
        }
        if(carry == 1){
            int[] ans = new int[n+1];
            ans[0] = 1;
            return ans;
        }
        return arr;
    }
}