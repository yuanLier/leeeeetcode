package _20200222;

/**
 * @author yuanyiwen
 * @create 2020-02-22 09:03
 * @description 反转链表
 *      题目描述 ：
 *          输入一个链表，反转链表后，输出新链表的表头。
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode n1 = null, n2 = head;
        while(head != null) {
            n2 = head.next;
            head.next = n1;
            n1 = head;
            head = n2;
        }
        return n1;
    }
}

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}

