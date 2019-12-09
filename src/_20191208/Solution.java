package _20191208;

/**
 * @author yuanyiwen
 * @create 2019-12-08 17:06
 * @description 21.合并两个有序链表 https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode res = node;
        while(l1 != null && l2 != null) {
            ListNode n = null;
            if(l1.val < l2.val) {
                n = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                n = new ListNode(l2.val);
                l2 = l2.next;
            }
            node.next = n;
            node = node.next;
        }
        node.next = (l1 != null) ? l1 : l2;

        return res.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
