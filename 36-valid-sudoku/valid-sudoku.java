class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int y = 0; y < board[i].length; y++) {
                if (board[i][y] == '.') continue;
                char current = board[i][y];

                // satır kontrolü
                for (int x = 0; x < board[i].length; x++) {
                    if (x != y && board[i][x] == current) return false;
                }

                // sütun kontrolü
                for (int z = 0; z < board.length; z++) {
                    if (z != i && board[z][y] == current) return false;
                }

                // 3x3 kutu kontrolü
                int rowStart = (i / 3) * 3;
                int colStart = (y / 3) * 3;
                for (int r = rowStart; r < rowStart + 3; r++) {
                    for (int c = colStart; c < colStart + 3; c++) {
                        if (!(r == i && c == y) && board[r][c] == current) return false;
                    }
                }
            }
        }
        return true;
    }
}
