class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] r=new HashSet[9];
        Set<Character>[] c=new HashSet[9];
        Set<Character>[] b=new HashSet[9];

        for(int i=0;i<9;i++){
            r[i]=new HashSet<>();
            c[i]=new HashSet<>();
            b[i]=new HashSet<>();
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;

                char val=board[i][j];
                int ind=(i/3)*3+(j/3);

                if(r[i].contains(val) || c[j].contains(val) || b[ind].contains(val)) return false;

                r[i].add(val);
                c[j].add(val);
                b[ind].add(val);
            }
        }
        return true;
    }
}