package _20191126;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yuanyiwen
 * @create 2019-11-26 21:57
 * @description 1.两数之和 https://leetcode-cn.com/problems/add-two-numbers/
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { map.get(target - nums[i]), i };
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }
}

