package _20200212;

/**
 * @author yuanyiwen
 * @create 2020-02-12 23:37
 * @description 88.合并两个有序数组 https://leetcode-cn.com/problems/merge-sorted-array/
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int res[] = new int[nums1.length];

        int index1 = 0;
        int index2 = 0;

        for(int i = 0; i < res.length; i++) {
            // 最开始这里是分了一个for出去的，但三个for不太好看就给并进来了
            // 这就是暴力所在了。。本来nums1存储在m后面的数字都应该是0的
            // 如果不处理一下，在后面那一步判断就会出问题
            // 因为0一定是小于nums2中的数字的，所以res就会疯狂存0
            // 于是这里就把m后面的数字强行变成9了
            if(index1 > m) {
                nums1[index1] = 9;
            }

            // 最外面要套一层边界判断
            if(index1 < m && index2 < n) {
                if(nums1[index1] <= nums2[index2]) {
                    res[i] = nums1[index1++];
                } else {
                    res[i] = nums2[index2++];
                }
            } else {
                // 然后分别处理
                if(index1 < m) {
                    res[i] = nums1[index1++];
                }
                if(index2 < n) {
                    res[i] = nums2[index2++];
                }
            }
        }

        for(int i = 0; i < res.length; i++) {
            nums1[i] = res[i];
        }
    }
}