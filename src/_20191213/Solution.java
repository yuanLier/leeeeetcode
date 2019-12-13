package _20191213;

/**
 * @author yuanyiwen
 * @create 2019-12-12 15:06
 * @description 29.两数相除 https://leetcode-cn.com/problems/divide-two-integers/
 */
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        // 防止溢出，MIN_VALUE的绝对值比MAX_VALUE大一个
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        // 用异或来计算是否符号相异
        boolean negative = (dividend ^ divisor) < 0;
        long t = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        int res = 0;
        for (int i = 31; i >= 0; i--) {
            // 找出足够大的数divisor * 2^i
            if ((t >> i) >= d) {
                // 将结果加上2^i
                res += (1 << i);
                // 将被除数减去divisor * 2^i
                t -= (d << i);
            }
        }
        return negative ? -res : res;
    }
}