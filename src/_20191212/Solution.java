package _20191212;

/**
 * @author yuanyiwen
 * @create 2019-12-12 10:08
 * @description 28.实现strStr() https://leetcode-cn.com/problems/implement-strstr/
 */
class Solution {
    public int strStr(String haystack, String needle) {

        if(needle.length() == 0) {
            return 0;
        }

        char[] hay = haystack.toCharArray();
        char[] need = needle.toCharArray();
        for(int i = 0; i <= hay.length-need.length; i++) {
            if(hay[i] == need[0]) {
                for(int j = 0; j < need.length; j++) {
                    if(hay[i+j] != need[j]) {
                        break;
                    }
                    if(j == need.length-1) {
                        return i;
                    }
                }
            }
        }

        return -1;
    }
}