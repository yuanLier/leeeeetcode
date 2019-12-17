package _20191217;

/**
 * @author yuanyiwen
 * @create 2019-12-16 16:56
 * @description 42.接雨水 https://leetcode-cn.com/problems/trapping-rain-water/
 */
public class Solution {
    /**
     * 建议直接看这里！讲得好好 ：https://leetcode-cn.com/problems/trapping-rain-water/solution/xiang-xi-tong-su-de-si-lu-fen-xi-duo-jie-fa-by-w-8/
     */
    public int trap(int[] height) {
        int sum = 0;
        int[] max_left = new int[height.length];
        int[] max_right = new int[height.length];
        for(int i = 1; i < height.length-1; i++) {
            max_left[i] = Math.max(max_left[i-1], height[i-1]);
        }
        for(int i = height.length-2; i >= 0; i--) {
            max_right[i] = Math.max(max_right[i+1], height[i+1]);
        }
        for(int i = 1; i < height.length-1; i++) {
            int min = Math.min(max_left[i], max_right[i]);
            if(height[i] < min) {
                sum += (min - height[i]);
            }
        }
        return sum;
    }
}
