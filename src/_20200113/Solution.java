package _20200113;

/**
 * @author yuanyiwen
 * @create 2020-01-12 17:17
 * @description 69.x的平方根 https://leetcode-cn.com/problems/sqrtx/
 */
public class Solution {
    /**
     * 牛顿迭代法 ：https://blog.csdn.net/u014485485/article/details/77599953
     */
    public int mySqrt(int x) {
        long n = x;
        while(n * n > x) {
            n = (n + x / n) / 2;
        }
        return (int) n;
    }
}