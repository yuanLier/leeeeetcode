package _20191204;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yuanyiwen
 * @create 2019-12-03 22:13
 * @description 15.三数之和 https://leetcode-cn.com/problems/3sum/
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        if(nums == null || nums.length < 3) {
            return res;
        }
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n && nums[i] <= 0; i++){
            // 去掉重复的
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int l = i+1, r = n-1, a = nums[i];
            while (l < r) {
                if (a + nums[l] + nums[r] == 0) {
                    res.add(Arrays.asList(a, nums[l], nums[r]));
                    // 去掉重复的
                    while (l < r && nums[l] == nums[l+1]) { l++; }
                    while (l < r && nums[r] == nums[r-1]) { r--; }
                    l++;
                    r--;
                } else if (a + nums[l] + nums[r] < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return res;
    }
}