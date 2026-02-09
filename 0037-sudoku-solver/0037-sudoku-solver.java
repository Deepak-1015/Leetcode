class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][]board){

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){

                if(board[i][j]=='.'){

                    for(char n='1';n<='9';n++){

                        if(valid(board,i,j,n)){
                            board[i][j]=n;


                            if(solve(board)) return true;

                            else board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean valid(char[][]board,int row,int col,char n){

        for(int i=0;i<9;i++){
            if(board[row][i]==n) return false;
        }
        for(int j=0;j<9;j++){
            if(board[j][col]==n) return false;
        }
        int r=(row/3)*3;
        int c=(col/3)*3;

        for(int j=r;j<r+3;j++){
            for(int i=c;i<c+3;i++){

                if(board[j][i]==n){
                    return false;
                }
            }
        }
        return true;
    }
}