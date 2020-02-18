package _20200218;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author yuanyiwen
 * @create 2020-02-18 09:41
 * @description 从尾到头打印链表
 *      题目描述 ：
 *          输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class Sooolution {

    /**
     * 不改变链表结构 ==> 每次从数组头部插入
     */
    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode tmp = listNode;
        while(tmp != null){
            list.add(0, tmp.val);
            tmp = tmp.next;
        }
        return list;
    }

    /**
     * 不改变链表结构 ==> 使用栈进行中间存储
     */
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ListNode node = listNode;
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        // 将链表中数据顺序导入栈中
        while(node != null) {
            stack.push(node.val);
            node = node.next;
        }
        // 将栈中数据依次取出，即为链表的倒序
        while(!stack.isEmpty()){
            for(int i = 0; i < stack.size(); i++){
                res.add(stack.pop());
            }
        }
        return res;
    }

    /**
     * 改变链表结构 ==> 反转链表后再操作
     */
    public ArrayList<Integer> printListFromTailToHead3(ListNode listNode) {
        ArrayList list = new ArrayList();
        ListNode n1 = null, n2 = new ListNode(0);
        while(listNode != null) {
            n2 = listNode.next;
            listNode.next = n1;
            n1 = listNode;
            listNode = n2;
        }
        while(n1 != null) {
            list.add(n1.val);
            n1 = n1.next;
        }
        return list;
    }
}

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}