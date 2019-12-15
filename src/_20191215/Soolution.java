package _20191215;

/**
 * @author yuanyiwen
 * @create 2019-12-15 18:47
 * @description 36.有效的数独 https://leetcode-cn.com/problems/valid-sudoku/
 */
class Soolution {
    public boolean isValidSudoku(char[][] board) {
        // 检查横纵
        for(int i = 0; i < board.length; i++) {
            int[] arr1 = new int[9];
            int[] arr2 = new int[9];
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] != '.' && ++arr1[board[i][j]-'1'] > 1) {
                    return false;
                }
                if(board[j][i] != '.' && ++arr2[board[j][i]-'1'] > 1) {
                    return false;
                }
            }
        }
        // 检查九宫格
        for(int m = 0; m < 9; m+=3) {
            for(int n = 0; n < 9; n+=3) {
                int[] arr = new int[9];
                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++) {
                        if(board[m+i][n+j] != '.' && ++arr[board[m+i][n+j]-'1'] > 1) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}