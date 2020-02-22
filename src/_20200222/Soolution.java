package _20200222;

/**
 * @author yuanyiwen
 * @create 2020-02-22 09:32
 * @description 合并两个排序的链表
 *      题目描述 ：
 *          输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Soolution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null)  return list2;
        if(list2 == null)  return list1;
        ListNode head = null;
        if(list1.val < list2.val) {
            head = list1;
            head.next = Merge(list1.next, list2);
        } else {
            head = list2;
            head.next = Merge(list1, list2.next);
        }
        return head;
    }
}

//class ListNode {
//    int val;
//    ListNode next = null;
//    ListNode(int val) {
//        this.val = val;
//    }
//}

