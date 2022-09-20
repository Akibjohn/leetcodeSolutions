class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int[] ans =new int[arr.length];
        Stack<Integer> st =new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]) st.pop();
            ans[i]=st.isEmpty() ? 0 : st.peek()-i;
            st.push(i);
        }
        return ans;
    }
}