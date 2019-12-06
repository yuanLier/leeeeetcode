package _20191206;

/**
 * @author yuanyiwen
 * @create 2019-12-06 20:10
 * @description 19.删除链表的倒数第N个节点 https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/submissions/
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        while(n-- > 0){
            fast = fast.next;
        }
        // 如果此时快指针已经为空了，说明待删除的是头节点，直接返回结果
        if(fast == null) return head.next;
        ListNode slow = head;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }