package _20191215;

/**
 * @author yuanyiwen
 * @create 2019-12-15 20:26
 * @description 38.报数 https://leetcode-cn.com/problems/count-and-say/
 */
class Sooolution {
    public String countAndSay(int n) {
        String res = "1";
        for(int i = 1; i < n; i++) {
            res = describe(res);
        }
        return res;
    }

    public String describe(String s) {

        StringBuffer res = new StringBuffer();
        char[] c = s.toCharArray();

        int record = 1;
        for(int i = 0; i < c.length-1; i++) {
            if(c[i] != c[i+1]) {
                res.append("" + record + c[i]);
                record = 1;
            } else {
                record++;
            }
        }

        res.append("" + record + c[c.length-1]);
        return res.toString();
    }
}