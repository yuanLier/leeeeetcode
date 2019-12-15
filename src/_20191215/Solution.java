package _20191215;

/**
 * @author yuanyiwen
 * @create 2019-12-14 17:13
 * @description 34.在排序数组中查找元素的第一个和最后一个位置 https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left <= right) {
            int mid = (left+right)/2;
            if(nums[mid] == target) {
                return help(nums, target, mid);
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new int[] {-1, -1};
    }

    private int[] help(int[] nums, int target, int mid) {
        int left = mid-1, right = mid+1;
        while(left >= 0 && nums[left] == target) { left--; }
        while(right < nums.length && nums[right] == target) { right++; }
        return new int[] {left+1, right-1};
    }
}