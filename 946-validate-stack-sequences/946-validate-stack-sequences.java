class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
        int i=0;
        int j=0;
        int n=pushed.length;
        while(i<n && j<n){
            st.push(pushed[i]);
            while(!st.isEmpty() && st.peek()==popped[j]){
                st.pop();
                j++;
            }
            i++;
            
        }
        System.out.println(st);
        return st.isEmpty();
    }
}