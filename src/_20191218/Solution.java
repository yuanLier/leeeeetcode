package _20191218;

/**
 * @author yuanyiwen
 * @create 2019-12-17 18:24
 * @description 44.通配符匹配 https://leetcode-cn.com/problems/wildcard-matching/
 */
class Solution {
    public static boolean isMatch(String s, String p) {
        int i = 0, j = 0;
        int star = -1, match = 0;
        while (i < s.length()) {
            // 一对一匹配，匹配成功则两指针共同向前
            if (j < p.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')) {
                i++;
                j++;
                // 出现"*"时，记录"*"的位置，和此时s对应的位置
            } else if (j < p.length() && p.charAt(j) == '*') {
                star = j++;
                match = i;
                // 如果star!=-1且走到了这里，说明前面已经出现过"*"了
                // 于是令j回到出现"*"的位置的下一个位置，match和i更新到下一个位置
            } else if (star != -1) {
                i = ++match;
                j = star+1;
            } else return false;
        }
        // 尾巴上多余的"*"用来匹配空
        while (j < p.length() && p.charAt(j) == '*') j++;
        return j == p.length();
    }
}