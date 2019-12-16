package _20191216;

/**
 * @author yuanyiwen
 * @create 2019-12-15 21:21
 * @description 41.缺失的第一个正数 https://leetcode-cn.com/problems/first-missing-positive/
 */
class Solution {
    /**
     * 1. 缺失的正数最大为 nums.length+1
     * 2. 将 nums 中的正数全部归位之后，没出现的正数就是缺失的第一个正数
     * 3. 归位时，如果该数对应位置的数为正数，就置为其相反数，否则就让它保持负数
     * 4. 这样 最后遍历的时候，如果是负数就说明这个数出现过了；那么出现的第一个非负数的位置，就是缺失的第一个正数
     */
    public int firstMissingPositive(int[] nums) {
        // 首先遍历，把全部非正数置为Integer.MAX_VALUE
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= 0) {
                nums[i] = Integer.MAX_VALUE;
            }
        }
        // 然后遍历，将当前位子上的数的绝对值(要求这个绝对值的值不超过数组长度)所对应的那个位子(要求这个位子上的数大于0)上的数置为其相反数
        for(int i = 0; i < nums.length; i++){
            if(Math.abs(nums[i]) <= nums.length && nums[Math.abs(nums[i])-1] > 0) {
                nums[Math.abs(nums[i])-1] *= -1;
            }
        }
        // 最后遍历，第一个非负数所对的位置就是res了
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= 0) {
                return i+1;
            }
        }
        return nums.length+1;
    }
}