package _20191211;

/**
 * @author yuanyiwen
 * @create 2019-12-11 22:20
 * @description 24.删除排序数组中的重复项 https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int index = 0;
        for(int i = 1; i < nums.length; i++) {
            // 如果当前遍历到的这个数不等于index对应的数，说明这是一个不重复的新数字
            if(nums[index] != nums[i]) {
                index++;
                nums[index] = nums[i];
            }
        }

        return index+1;
    }
}