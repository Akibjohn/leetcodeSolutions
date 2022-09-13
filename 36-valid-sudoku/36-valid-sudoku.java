class Solution {
    public boolean valid_sudoku(int[][] mat,int r,int c, int val)
    {
        //Row wale elements check honge
        for(int k=0;k<9;++k)
        {
            if(mat[k][c]==val && k!=r)
            {
                return false;
            }
        }
        //Column wale elements check honge
        for(int k=0;k<9;++k)
        {
            if(mat[r][k]==val && k!=c)
            {
                return false;
            }
        }
        //Grid wale elements check honge
        int i=(r/3)*3;
        int j=(c/3)*3;
        for(int k=0;k<3;++k)
        {
            for(int l=0;l<3;++l)
            {
                if(mat[k+i][l+j]==val && (k+i)!=r && (l+j)!=c)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        int[][] mat=new int[9][9];
        for(int r=0;r<9;++r)
        {
            for(int c=0;c<9;c++)
            {
                if(board[r][c]!='.')
                {
                    mat[r][c]=board[r][c]-'0';
                }
            }
        }
        for(int r=0;r<9;++r) // integer wale array m traversal shuru horaha h
        {
            for(int c=0;c<9;c++)
            {
                if(mat[r][c]!=0)
                {
                    boolean ans=valid_sudoku(mat,r,c,mat[r][c]);
                    if(ans==false)
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}