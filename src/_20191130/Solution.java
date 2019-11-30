package _20191130;

/**
 * @author yuanyiwen
 * @create 2019-11-30 22:52
 * @description 7.整数反转 https://leetcode-cn.com/problems/reverse-integer/
 */
class Solution {
    public int reverse(int x) {
        long res = 0;
        while(x != 0){
            // 取个位
            res = res * 10 + x % 10;
            // 去掉个位
            x /= 10;
        }
        // 边界处理
        return (res > Integer.MAX_VALUE || res <Integer.MIN_VALUE) ? 0 : (int)res;
    }
}