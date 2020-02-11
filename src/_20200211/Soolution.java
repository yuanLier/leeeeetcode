package _20200211;

/**
 * @author yuanyiwen
 * @create 2020-02-11 21:55
 * @description 79.单词搜索 https://leetcode-cn.com/problems/word-search/submissions/
 */
public class Soolution {
    public boolean exist(char[][] board, String word) {
        boolean[][] flag = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(help(flag, board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }


    private boolean help(boolean[][] flag, char[][] board, int i, int j, String word, int index) {

        if(index >= word.length()) { return true; }
        if(i >= board.length || i < 0 || j >= board[0].length || j < 0) {
            return false;
        }

        boolean res = false;
        if(!flag[i][j] && board[i][j] == word.charAt(index)) {
            flag[i][j] = true;
            res = help(flag, board, i-1, j, word, index+1) ||
                    help(flag, board, i+1, j, word, index+1) ||
                    help(flag, board, i, j-1, word, index+1) ||
                    help(flag, board, i, j+1, word, index+1);
            flag[i][j] = false;
        }
        return res;
    }
}