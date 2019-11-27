package _20191127;

/**
 * @author yuanyiwen
 * @create 2019-11-27 17:27
 * @description 3.无重复字符的最长子串 https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // i每次朝前走一个，j每次从下标index判断到下标i，看arr[j]有没有和当前arr[i]重复，如果有字符重复了，就更新index
        // index到i之间的字符是确保非重复的
        int res = 0, index = 0;
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            for(int j = index; j < i; j++) {
                if(arr[j] == arr[i]) {
                    res = Math.max(res, i-index);
                    index = j + 1;
                    break;
                }
            }
        }
        return res;
    }
}