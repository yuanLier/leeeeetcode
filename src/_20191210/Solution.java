package _20191210;

/**
 * @author yuanyiwen
 * @create 2019-12-10 18:12
 * @description 23.合并k个排序链表 https://leetcode-cn.com/problems/merge-k-sorted-lists/
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        return partion(lists, 0, lists.length-1);
    }

    /**
     * 分治法(｀・ω・´)
     * @param lists
     * @param l
     * @param r
     * @return
     */
    private ListNode partion(ListNode[] lists, int l, int r){
        if(l == r){
            return lists[l];
        }
        int m = (l + r) / 2;
        return merge(partion(lists, l, m), partion(lists, m+1, r));
    }

    /**
     * 合并两个链表
     * @param l1
     * @param l2
     * @return
     */
    private ListNode merge(ListNode l1,ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val){
            l1.next = merge(l1.next, l2);
            return l1;
        }else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
