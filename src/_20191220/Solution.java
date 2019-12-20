package _20191220;

/**
 * @author yuanyiwen
 * @create 2019-12-19 20:29
 * @description 48.旋转图像 https://leetcode-cn.com/problems/rotate-image/
 */
public class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < len/2; i++) {
            for (int j = i; j < len-1-i; j++) {
                swap(matrix, i, j, len);
            }
        }
    }

    private void swap(int[][] matrix, int i, int j, int len) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[len-1-j][i];
        matrix[len-1-j][i] = matrix[len-1-i][len-1-j];
        matrix[len-1-i][len-1-j] = matrix[j][len-1-i];
        matrix[j][len-1-i] = temp;
    }
}