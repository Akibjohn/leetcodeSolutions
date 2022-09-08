class Solution {
    public void set(int[][] matrix,int row,int col){
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            matrix[i][col]=0;
        }
        for(int i=0;i<m;i++){
            matrix[row][i]=0;
        }
    }
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean toChange[][] = new boolean[n][m];
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                if(matrix[r][c]==0){
                    toChange[r][c]=true; 
                }
            }
        }
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                if(matrix[r][c]==0  && toChange[r][c]==true){
                    set(matrix,r,c);
                } 
            }
        }
        
        
    }
}