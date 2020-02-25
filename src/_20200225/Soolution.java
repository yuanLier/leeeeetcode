package _20200225;

import java.util.ArrayList;

/**
 * @author yuanyiwen
 * @create 2020-02-25 12:20
 * @description 顺时针打印矩阵
 *      题目描述 ：
 *          输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 *          例如，如果输入如下4 X 4矩阵：
 *          1   2   3   4
 *          5   6   7   8
 *          9   10  11  12
 *          13  14  15  16
 *          则依次打印出数字
 *          1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10.
 */
public class Soolution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
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