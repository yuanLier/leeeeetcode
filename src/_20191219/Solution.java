package _20191219;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuanyiwen
 * @create 2019-12-18 16:56
 * @description 46.全排列 https://leetcode-cn.com/problems/permutations/
 */
class Solution {

    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int[] arr = new int[nums.length];
        backtrace(nums, new ArrayList<>(), arr);
        return res;
    }

    private void backtrace(int[] nums, List<Integer> list, int[] arr) {
        if(list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(arr[i] == 1) continue;
            arr[i] = 1;
            list.add(nums[i]);
            backtrace(nums, list, arr);
            list.remove(list.size()-1);
            arr[i] = 0;
        }
    }
}