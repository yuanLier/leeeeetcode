package _20200112;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author yuanyiwen
 * @create 2020-01-11 22:45
 * @description 56.合并区间 https://leetcode-cn.com/problems/merge-intervals/
 */
public class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals.length < 2) {
            return intervals;
        }

        List<int[]> list = new ArrayList<>();
        for(int[] interval : intervals) {
            int min = interval[0], max = interval[1];
            Iterator<int[]> iterator = list.iterator();
            while(iterator.hasNext()) {
                int[] temp = iterator.next();
                if(!(interval[0] > temp[1] || interval[1] < temp[0])) {
                    min = Math.min(min, temp[0]);
                    max = Math.max(max, temp[1]);
                    iterator.remove();
                }
            }
            list.add(new int[] {min, max});
        }
        return list.toArray(new int[list.size()][2]);
    }
}