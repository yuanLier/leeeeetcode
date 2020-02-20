package _20200220;

/**
 * @author yuanyiwen
 * @create 2020-02-20 09:55
 * @description 变态跳台阶
 *      题目描述 ：
 *          一只青蛙一次可以跳上1级台阶，
 *          也可以跳上2级……
 *          它也可以跳上n级。
 *          求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Sooolution {
    /**
     * 跳台阶是 f(n) = f(n-1) + f(n-2)
     * 这个是 f(n) = f(n-1) + f(n-2) + f(n-3) + ... + f(1)
     *
     * f(n) = f(n-1) + f(n-2) + f(n-3) + ... + f(1)
     *        f(n-1) = f(n-2) + f(n-3) + ... + f(1)
     * ==> f(n) = f(n-1) + f(n-1) = 2 * f(n-1)
     */
    public int JumpFloorII(int target) {
        return 1 << (target-1);
    }
}