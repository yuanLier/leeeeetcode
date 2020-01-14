package _20200114;

/**
 * @author yuanyiwen
 * @create 2020-01-13 14:39
 * @description 75.颜色分类 https://leetcode-cn.com/problems/sort-colors/submissions/
 */
public class Solution {
    public void sortColors(int[] nums) {
        int red = -1, blue = nums.length, i = 0;
        while(i < blue) {
            if(nums[i] == 0) {
                swap(nums, i, ++red);
                // 这里是为了避免nums[i]==2时，交换了一个0过来，然后下一次遍历又会走到这里，始终自己和自己交换，red无限++，最终超出数组范围
                i = red + 1;
            } else if (nums[i] == 2) {
                swap(nums, i, --blue);
            } else {
                i++;
            }
        }
    }
    public void swap(int[] nums, int x, int y){
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }
}
