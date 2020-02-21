package _20200221;

/**
 * @author yuanyiwen
 * @create 2020-02-21 08:08
 * @description 二进制中1的个数
 *      题目描述 ：
 *          输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Solution {
    /**
     * 目瞪狗呆QAQ 贴一个大佬的讲解 ：
     * https://www.nowcoder.com/questionTerminal/8ee967e43c2c4ec193b040ea7fbb10b8?answerType=1&f=discussion
     *
     * 大致意思是说，
     *      n-1 会将 n 的最右边一位 1 变成 0，其余右边的 0 变成 1，即相当于从最右边第一个 1 开始取反；
     *      那么，当 n & (n-1)，则会将最右边一位 1 及其右边的位全部变成 0；即相当于去掉了一个 1
     *      示例 ：
     *          27 的二进制 ：11011， 27-1 的二进制 ： 11100， 27 & (27-1) = 11011 & 11100 = 11000
     */
    public int NumberOf1(int n) {
        int res = 0;
        while(n != 0){
            res++;
            n = n & (n-1);
        }
        return res;
    }
}