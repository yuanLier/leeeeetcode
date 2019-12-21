package _20191221;

/**
 * @author yuanyiwen
 * @create 2019-12-21 22:12
 * @description 53.最大子序和 https://leetcode-cn.com/problems/maximum-subarray/
 */
public class Sooolution {
    public int maxSubArray(int[] nums) {
        int res = nums[0], cur = 0;
        for(int i = 0; i < nums.length; i++) {
            // 如果当前总和为正，就在原来的基础上再加上这个数；否则，就重新从这个数开始计算
            cur = (cur > 0) ? cur+nums[i] : nums[i];
            // 更新最大子序和
            res = Math.max(res, cur);
        }
        return res;
    }
}