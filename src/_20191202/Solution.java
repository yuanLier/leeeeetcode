package _20191202;

/**
 * @author yuanyiwen
 * @create 2019-12-02 16:19
 * @description 10.正则表达式匹配
 */
class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] f = new boolean[m+1][n+1];

        // 填充边界格子的值
        f[0][0] = true;
        for(int i = 2; i <= n; i++) {
            f[0][i] = f[0][i-2] && p.charAt(i-1) == '*';
        }

        // 填充其余各自的值，外层循环是s，内层循环是p
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.'){
                    f[i][j] = f[i-1][j-1];
                }
                if(p.charAt(j-1) == '*') {
                    f[i][j] = f[i][j-2] ||
                            f[i-1][j] && (s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.');
                }
            }
        }

        return f[m][n];
    }
}
