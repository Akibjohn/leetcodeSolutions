class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        Stack<int[]> st=new Stack<>();
        for(int[] oned: intervals){
            if(st.isEmpty()) st.push(oned);
            else{
                if(oned[0]<=st.peek()[1]){
                    int[] poped=st.pop();
                    st.push(new int[]{poped[0],Math.max(poped[1],oned[1])});
                }else {
                    st.push(oned);
                }
            }
        }
        int ans[][]=new int[st.size()][2];
        int idx=0;
        for(int[] oned : st){
            ans[idx++]=oned;
        }
        return ans;
        
    }
}