package _20200112;

import java.util.Arrays;

/**
 * @author yuanyiwen
 * @create 2020-01-12 16:53
 * @description 62.不同路径 https://leetcode-cn.com/problems/unique-paths/
 */
public class Soolution {
    /**
     * 具体思路看这里 ：https://leetcode-cn.com/problems/unique-paths/solution/xiao-xue-ti-java-by-biyu_leetcode/
     */
    public int uniquePaths(int m, int n) {
        int[] res = new int[n];
        Arrays.fill(res, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                res[j] += res[j-1];
            }
        }
        return res[n-1];
    }
}