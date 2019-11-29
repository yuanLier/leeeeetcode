package _20191129;

/**
 * @author yuanyiwen
 * @create 2019-11-29 21:47
 * @description 5.最长回文子串 https://leetcode-cn.com/problems/longest-palindromic-substring/
 */
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len = Math.max(help(s, i, i), help(s, i, i+1));
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    // 中心扩展法！对每一个字符考虑从字符起朝两边扩展的情况 -->
    // 注意要分情况讨论 ： aba式 和 abba式
    private int help(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}