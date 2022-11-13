class Solution {
    public int removeElement(int[] arr, int val) {
        int n=arr.length;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]!=val){
               al.add(arr[i]);
            }
        }
        int idx=0;
        for(int i=0;i<al.size();i++){
            arr[i]=al.get(i);
        }
        return al.size();
        
    }
}