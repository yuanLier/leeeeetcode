package _20191221;

/**
 * @author yuanyiwen
 * @create 2019-12-21 21:44
 * @description 50.Pow(x, n) https://leetcode-cn.com/problems/powx-n/
 */
public class Soolution {
    /**
     * 快速幂算法：如果令A=x^(n/2)，那么要得到x^n的话，就可以通过对n分奇偶求解：
     *      如果n为偶数，则x^n就等于A*A；
     *      如果n为奇数，则A*A只能得到x^(n-1)，所以我们要再乘一个x，即A*A*x
     */
    public double myPow(double x, int n) {
        double res = 1.0;
        for(int i = n; i != 0; i /= 2) {
            if(i % 2 != 0) {
                res *= x;
            }
            x *= x;
        }
        return n < 0 ? 1/res : res;
    }
}
