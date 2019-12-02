package _20191202;

/**
 * @author yuanyiwen
 * @create 2019-12-02 16:43
 * @description 11.盛最多水的容器 https://leetcode-cn.com/problems/container-with-most-water/
 */
class Soolution {
    /**
     * 大概思路就是移动较小的边，因为移动虽然会带来矩形宽度的减小，但选择较小边移动的话，就可能会因移动到了一条更长的边来平衡这种宽度减小，甚至使整体面积增大
     */
    public int maxArea(int[] height) {
        int minHeight = Integer.MAX_VALUE, res = 0;
        int left = 0, right = height.length-1;
        while(left < right) {
            minHeight = (height[left] < height[right]) ? height[left++] : height[right--];
            res = Math.max(res, (right-left+1) * minHeight);
        }
        return res;
    }
}