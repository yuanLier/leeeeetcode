package _20191128;

/**
 * @author yuanyiwen
 * @create 2019-11-28 15:28
 * @description 4.寻找两个有序数组的中位数 https://leetcode-cn.com/problems/median-of-two-sorted-arrays/comments/
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int left = (n + m + 1) / 2;
        int right = (n + m + 2) / 2;
        //将偶数和奇数的情况合并，如果是奇数，会求两次同样的 k 。
        return (getKth(nums1, 0, n - 1, nums2, 0, m - 1, left) + getKth(nums1, 0, n - 1, nums2, 0, m - 1, right)) * 0.5;
    }

    private int getKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        // 从start到end，共end-start+1个数
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        //让 len1 的长度小于 len2，这样就能保证如果有数组空了，一定是 len1
        if (len1 > len2) {
            return getKth(nums2, start2, end2, nums1, start1, end1, k);
        }
        // 如果数组空，直接返回另一个数组中k对应的数
        if (len1 == 0) {
            return nums2[start2 + k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }

        // 分别找到两个数组的中间下标
        int i = start1 + Math.min(len1, k / 2) - 1;
        int j = start2 + Math.min(len2, k / 2) - 1;

        return (nums1[i] > nums2[j]) ?
                getKth(nums1, start1, end1, nums2, j + 1, end2, k - (j - start2 + 1)) :
                getKth(nums1, i + 1, end1, nums2, start2, end2, k - (i - start1 + 1));
    }
}
