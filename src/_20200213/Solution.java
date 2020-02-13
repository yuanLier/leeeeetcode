package _20200213;

/**
 * @author yuanyiwen
 * @create 2020-02-13 12:20
 * @description 91.解码方法 https://leetcode-cn.com/problems/decode-ways/
 */
public class Solution {
    /**
     * 还是动态规划（趴 一个数字可以看做它本身，也可以看做是和前一个数字的组合
     * @param s
     * @return
     */
    public int numDecodings(String s) {
        char[] c = s.toCharArray();
        int[] arr = new int[c.length+1];
        arr[0] = 1;
        for(int i = 1; i <= c.length; i++) {
            arr[i] = 0;
            if(c[i-1] >= '1' && c[i-1] <= '9') {
                arr[i] += arr[i-1];
            }

            if(i > 1) {
                int j = 10*(c[i-2]-'0') + (c[i-1]-'0');
                if (j >= 10 && j <= 26){
                    arr[i] += arr[i-2];
                }
            }
        }
        return arr[c.length];
    }
}
