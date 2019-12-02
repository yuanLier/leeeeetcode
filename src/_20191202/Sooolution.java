package _20191202;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yuanyiwen
 * @create 2019-12-02 19:51
 * @description 13.罗马数字转整数 https://leetcode-cn.com/problems/roman-to-integer/
 */
class Sooolution {
    /**
     * 如果当前值小于它的下一个值，就减当前值；反之则加当前值
     */
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int res = map.get(s.charAt(s.length()-1));
        for(int i = 0; i < s.length()-1; i++) {
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))) {
                res += map.get(s.charAt(i));
            } else {
                res -= map.get(s.charAt(i));
            }
        }

        return res;
    }
}