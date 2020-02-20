package _20200220;

/**
 * @author yuanyiwen
 * @create 2020-02-20 08:44
 * @description 斐波那契数列
 *      题目描述 ：
 *          大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。（n <= 39）
 */
public class Solution {
    /**
     * 推荐使用循环
     */
    public int Fibonacci1(int n) {
        int p1 = 0, p2 = 1;
        while(n-- > 0) {
            p2 = p2 + p1;
            p1 = p2 - p1;
        }
        return p1;
    }

    /**
     * 也可以用递归，不过会慢相当多
     */
    public int Fibonacci2(int n) {
        if(n <= 1) {
            return n;
        }
        return Fibonacci2(n-1) + Fibonacci2(n-2);
    }
}
