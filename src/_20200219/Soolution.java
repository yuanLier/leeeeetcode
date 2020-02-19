package _20200219;

import java.util.Stack;

/**
 * @author yuanyiwen
 * @create 2020-02-19 10:56
 * @description 用两个栈实现队列
 *      题目描述 ：
 *          用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class Soolution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        // 每次入栈只从栈1入
        stack1.push(node);
    }

    public int pop() {
        // 当栈2为空时
        if(stack2.isEmpty()) {
            // 将栈1的元素依次放入栈2
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        // 当栈2不为空时，直接弹出栈2的栈顶元素
        return stack2.pop();
    }
}