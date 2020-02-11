package _20200211;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuanyiwen
 * @create 2020-02-11 12:10
 * @description 78.子集 https://leetcode-cn.com/problems/subsets/
 */
public class Solution {
    /**
     * 就是往后遍历，每遇到一个数就把所有的子集加上这个数组成新的子集
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for(int i = 0; i < nums.length; i++) {
            int all = res.size();
            for(int j = 0; j < all; j++) {
                List<Integer> list = new ArrayList<>(res.get(j));
                list.add(nums[i]);
                res.add(list);
            }
        }
        return res;
    }
}