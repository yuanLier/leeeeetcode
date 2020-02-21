package _20200221;

/**
 * @author yuanyiwen
 * @create 2020-02-21 08:31
 * @description 数值的整数次方
 *      题目描述 ：
 *          给定一个double类型的浮点数base和int类型的整数exponent。
 *          求base的exponent次方。
 *          保证base和exponent不同时为0
 */
public class Soolution {
    /**
     * 快速幂算法：
     *      如果令A=x^(n/2)，那么要得到x^n的话，就可以通过对n分奇偶求解 ：
     *      如果n为偶数，则x^n就等于A*A；
     *      如果n为奇数，则A*A只能得到x^(n-1)，所以我们要再乘一个x，即A*A*x
     */
    public static double Power(double base, int exponent) {
        double res = 1.0;
        for(int i = exponent; i != 0; i /= 2) {
            // 当 "n" 为奇数时，需要多乘一个 x
            if(i % 2 != 0) {
                res *= base;
            }
            base *= base;
        }
        return exponent < 0 ?  1/res : res;
    }
}
