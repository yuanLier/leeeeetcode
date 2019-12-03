package _20191203;

/**
 * @author yuanyiwen
 * @create 2019-12-03 22:34
 * @description 14.最长公共前缀 https://leetcode-cn.com/problems/longest-common-prefix/
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            // 如果不是当前字符串的前缀
            while (strs[i].indexOf(prefix) != 0) {
                // 就往前减一个
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        return prefix;
    }
}