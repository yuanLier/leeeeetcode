package _20200220;

/**
 * @author yuanyiwen
 * @create 2020-02-20 09:41
 * @description 跳台阶
 *      题目描述 ：
 *          一只青蛙一次可以跳上1级台阶，
 *          也可以跳上2级。
 *          求该青蛙跳上一个n级的台阶总共有多少种跳法
 *          （先后次序不同算不同的结果）。
 */
public class Soolution {
    /**
     * 本质上还是斐波那契啦
     */
    public int JumpFloor(int target) {
        int p1 = 1, p2 = 1;
        while(target-- > 0) {
            p2 = p2 + p1;
            p1 = p2 - p1;
        }
        return p1;
    }
}
