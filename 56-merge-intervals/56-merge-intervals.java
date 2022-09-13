class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        Stack<int[]> st = new Stack<>();
        //st = [];
        for(int[] oned : intervals) {
            if(st.isEmpty()) st.push(oned);
            // st = [{1,3}]
            else {
                if(oned[0] <= st.peek()[1]){ // st.peek()[1] = [1,3] {
                    st.peek()[1] = Math.max(st.peek()[1],oned[1]);
                } else {
                    st.push(oned);
                }
            }
        }
        int ans[][] = new int[st.size()][2], idx = 0;
        for(int[] oned : st) ans[idx ++] = oned;
        return ans;
    }
}