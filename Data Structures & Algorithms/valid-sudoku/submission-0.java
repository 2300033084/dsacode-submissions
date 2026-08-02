class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character> r[]=new HashSet[9];
        HashSet<Character> c[]=new HashSet[9];
        HashSet<Character> box[]=new HashSet[9];
        for(int i=0;i<9;i++)
        {
            r[i]=new HashSet<>();
            c[i]=new HashSet<>();
            box[i]=new HashSet<>();
        }
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char s=board[i][j];
                if(s =='.')
                {
                    continue;
                }
                int b=(i/3)*3+ (j/3);
                if(r[i].contains(s) || c[j].contains(s) || box[b].contains(s) )
                {
                    return false;
                }
                r[i].add(s);
                c[j].add(s);
                box[b].add(s);
            }
        }
        return true;

        
    }
}