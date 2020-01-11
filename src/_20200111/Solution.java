package _20200111;

/**
 * @author yuanyiwen
 * @create 2019-12-22 14:25
 * @description 55.跳跃游戏 https://leetcode-cn.com/problems/jump-game/
 */
class Solution {
    public boolean canJump(int[] nums) {
        int need = 1;
        // i：当前坐标 need：需要几步能够到达i
        for(int i = nums.length-1; i > 0; i--) {
            // 如果 i-need 不能到达，就检测它的前一个能不能到达
            if(nums[i-need] < need) {
                while(i-need >= 0 && nums[i-need] < need) {
                    need++;
                }
            }
            if(i-need < 0) {
                return false;
            }
            need = 1;
        }
        return true;
    }
}