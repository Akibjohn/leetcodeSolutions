class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans =new int[nums2.length];
        Stack<Integer> st =new Stack<>();
        HashMap<Integer, Integer> hm =new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]) st.pop();
            ans[i]=st.isEmpty() ? -1 : st.peek();
            st.push(nums2[i]);
        }
        for(int i=0;i<nums2.length;i++){
            hm.put(nums2[i],ans[i]);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=hm.get(nums1[i]);
        }
        
        return nums1;
    }
}