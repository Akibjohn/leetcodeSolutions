class Solution {
    public void swap(int[][] matrix,int row,int col){
        int temp=matrix[row][col];
        matrix[row][col]=matrix[col][row];
        matrix[col][row]=temp;
    }
    public void transpose(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                if(r>c){
                    swap(matrix ,r,c);
                }
            }
        }
    }
    public void swapCol(int[][] matrix ,int row,int start,int end){
        int temp=matrix[row][start];
        matrix[row][start]=matrix[row][end];
        matrix[row][end]=temp;
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        transpose(matrix);
        int row=0;
        for(int r=0;r<n;r++){
            int start=0;
            int end=m-1;
            while(start<end){
                swapCol(matrix,r,start++,end--);
            }
        }
        
        
    }
}