package _20191201;

/**
 * @author yuanyiwen
 * @create 2019-12-01 21:57
 * @description 8.字符串转换整数（atoi） https://leetcode-cn.com/problems/string-to-integer-atoi/submissions/
 */
class Solution {
    public int myAtoi(String str) {
        if(str.length() == 0) {  return 0; }
        char[] c = str.toCharArray();

        int i = 0;
        while(i < c.length-1 && c[i] == ' ') {  i++; }
        if(!(c[i] == '+' || c[i] == '-' || (c[i] >= '0' && c[i] <= '9'))) {  return 0; }

        StringBuffer sb = new StringBuffer();
        if(c[i] >= '0' && c[i] <= '9') { sb.append(c[i]); }

        boolean isNegative = (c[i++] == '-');
        while(i < c.length && c[i] >= '0' && c[i] <= '9') { sb.append(c[i++]); }
        if("".equals(sb.toString())) {  return 0; }
        Integer res;
        try {
            res = Integer.parseInt(sb.toString());
        } catch(NumberFormatException e) {
            return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        return isNegative ? -res : res;
    }
}