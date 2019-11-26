package _20191126;

/**
 * @author yuanyiwen
 * @create 2019-11-26 22:21
 * @description 2.两数相加 https://leetcode-cn.com/problems/add-two-numbers/
 */
public class Soolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode node = new ListNode(0);
        ListNode res = node;

        int cur = 0;
        // 只要l1或l2有一个不为空，或者两个都为空了但上一轮有进位，循环就持续执行
        while(l1 != null || l2 != null || cur != 0) {
            if(l1 != null) {
                cur += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                cur += l2.val;
                l2 = l2.next;
            }
            node.next = new ListNode(cur % 10);
            cur /= 10;
            node = node.next;
        }

        return res.next;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
