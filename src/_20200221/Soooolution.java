package _20200221;

/**
 * @author yuanyiwen
 * @create 2020-02-21 10:31
 * @description 链表中倒数第k个节点
 *      题目描述 ：
 *          输入一个链表，输出该链表中倒数第k个结点。
 */
public class Soooolution {
    /**
     * 快慢指针
     */
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode slow = head, fast = head;
        while(k-- > 0) {
            // 防止k大于链表长度
            if(fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
