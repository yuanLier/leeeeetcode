package _20191209;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuanyiwen
 * @create 2019-12-09 21:28
 * @description 22.括号生成 https://leetcode-cn.com/problems/generate-parentheses/submissions/
 */
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList();
        help(res, "", 0, 0, n);
        return res;
    }

    public void help(List<String> list, String cur, int left, int right, int max){
        if (cur.length() == max*2) {
            list.add(cur);
            return;
        }

        // 如果左括号还没有到最大数量，就可以添加一个左括号
        if (left < max)
            help(list, cur+"(", left+1, right, max);
        // 如果右括号的数量还没有超过左括号，就可以添加一个右括号
        if (right < left)
            help(list, cur+")", left, right+1, max);
    }
}