package _20200113;

/**
 * @author yuanyiwen
 * @create 2020-01-13 14:12
 * @description 73.矩阵置零 https://leetcode-cn.com/problems/set-matrix-zeroes/
 */
public class Sooolution {
    public void setZeroes(int[][] matrix) {
        // 判断首行有没有为0的
        boolean rowFlag = false;
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                rowFlag = true;
                break;
            }
        }
        // 判断首列有没有为0的
        boolean colFlag = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                colFlag = true;
                break;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                // 遍历中间的，如果他们中出现了0，就将其对应的首行与首列的置位0
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        // 将首行中为0的那些数所对应的列上的数置为0
        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
        // 将首列中为0的那些数所对应的行上的数置为0
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        // 如果初始首行存在0，就将首行也置为0
        if (rowFlag){
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
        // 如果初始首列存在0，就将首列也置为0
        if (colFlag){
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}