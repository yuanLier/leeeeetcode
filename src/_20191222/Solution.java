package _20191222;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuanyiwen
 * @create 2019-12-21 22:32
 * @description 54.螺旋矩阵 https://leetcode-cn.com/problems/spiral-matrix/
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List res = new ArrayList();
        if(matrix.length == 0) {
            return res;
        }
        int len1 = matrix.length, len2 = matrix[0].length;

        boolean[][] seen = new boolean[len1][len2];
        // 右下左上
        int[] di = {0, 1, 0, -1};
        int[] dj = {1, 0, -1, 0};
        int i = 0, j = 0, dir = 0;
        for(int index = 0; index < len1*len2; index++, i += di[dir], j += dj[dir]) {
            res.add(matrix[i][j]);
            seen[i][j] = true;

            // 判断沿着这个方向还能不能继续往前走
            int ti = i + di[dir], tj = j + dj[dir];
            // 如果不能往前了就换方向
            if(!((ti >= 0 && ti < len1) && (tj >= 0 && tj < len2) && !seen[ti][tj])) {
                dir = (dir+1) % 4;
            }
        }
        return res;
    }
}