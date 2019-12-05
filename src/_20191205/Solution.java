package _20191205;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yuanyiwen
 * @create 2019-12-04 21:38
 * @description 17.电话号码的数字组合 https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 */
class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> res = new ArrayList<>();
        helper("", digits, 0, res, map);
        return res;
    }

    private void helper(String s, String digits, int i, List<String> res, Map<Character, String> map) {
        if(i == digits.length()) {
            res.add(s);
            return;
        }
        String letters = map.get(digits.charAt(i));
        for(char c : letters.toCharArray()) {
            helper(s+c, digits, i+1, res, map);
        }
    }
}
