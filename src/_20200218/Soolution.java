package _20200218;

/**
 * @author yuanyiwen
 * @create 2020-02-18 09:21
 * @description 替换空格
 *      问题描述 ：
 *          请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 *          例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Soolution {

    /**
     * 调用库函数实现
     */
    public String replaceSpace1(StringBuffer str) {
        return str.toString().replace(" ", "%20");
    }

    /**
     * 直接开辟新字符串实现
     */
    public String replaceSpace2(StringBuffer str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == ' '){
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * 在原字符串的基础上进行操作
     */
    public String replaceSpace3(StringBuffer str) {
        // 首先计数原字符串的空格数量，记为 count
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                count++;
            }
        }
        // 对原字符串进行扩容，扩容后的容量为 原字符串容量+count*2；从右到左覆盖
        int i = str.length()-1, j = i+count*2;
        str.setLength(j+1);
        for(; i >= 0 && i < j; i--){
            if(str.charAt(i) == ' '){
                str.setCharAt(j--, '0');
                str.setCharAt(j--, '2');
                str.setCharAt(j--, '%');
            }else{
                str.setCharAt(j--, str.charAt(i));
            }
        }
        return str.toString();
    }
}
