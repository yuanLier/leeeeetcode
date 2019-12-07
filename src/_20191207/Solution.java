package _20191207;

import java.util.Stack;

/**
 * @author yuanyiwen
 * @create 2019-12-07 20:40
 * @description 20.有效的括号 https://leetcode-cn.com/problems/valid-parentheses/
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(stack.size() != 0 && isMatch(stack.peek(), c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.size() == 0;
    }

    private boolean isMatch(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
    }
}
