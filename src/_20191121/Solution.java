package _20191121;

import java.util.*;

/**
 * @author yuanyiwen
 * @create 2019-12-21 16:55
 * @description 49.字母异位词分组 https://leetcode-cn.com/problems/group-anagrams/
 */
public class Solution {
    /**
     * 还有一种通用处理方式是把字母和质数对应起来，然后hash
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
