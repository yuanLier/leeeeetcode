package _20191214;

/**
 * @author yuanyiwen
 * @create 2019-12-13 19:50
 * @description 33.搜索旋转排序数组 https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
 */
class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(target == nums[mid]) {
                return mid;
            }
            // 如果按照正常顺序，mid对应的数应该大于left；出现异常就说明左半部分是乱序的，那么右半部分一定告诉顺序的
            if(nums[mid] < nums[left]) {
                // 对右半部分进行判断，如果mid<target<right，说明这个数的确在右边
                if(nums[mid] < target && target <= nums[right]) {
                    left = mid+1;
                // 否则，就说明这个数不在右半部分；直接丢弃这个区间
                } else {
                    right = mid-1;
                }
            } else {
                if(nums[left] <= target && target < nums[mid]) {
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            }
        }
        return -1;
    }
}