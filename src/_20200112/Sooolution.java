package _20200112;

/**
 * @author yuanyiwen
 * @create 2020-01-12 17:14
 * @description 66.加一 https://leetcode-cn.com/problems/plus-one/submissions/
 */
public class Sooolution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for(int i = length-1; i >= 0; i--) {
            // 非9加1
            if(digits[i] != 9) {
                digits[i] += 1;
                return digits;
            }
            // 逢9置0
            digits[i] = 0;
        }
        // 全部为9，则需要数组扩充1位
        int[] res = new int[length+1];
        res[0] = 1;
        return res;
    }
}
