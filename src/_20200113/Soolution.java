package _20200113;

/**
 * @author yuanyiwen
 * @create 2020-01-13 13:06
 * @description 70.爬楼梯 https://leetcode-cn.com/problems/climbing-stairs/submissions/
 */
public class Soolution {
    /**
     * 其实就是一个斐波拉契啦
     */
    public int climbStairs(int n) {
        int prev1 = 1, prev2 = 1;
        for(int i = 2; i <= n; i++) {
            int temp = prev2;
            prev2 += prev1;
            prev1 = temp;
        }
        return prev2;
    }
}