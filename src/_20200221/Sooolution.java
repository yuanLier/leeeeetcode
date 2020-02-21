package _20200221;

/**
 * @author yuanyiwen
 * @create 2020-02-21 09:53
 * @description 调整数组顺序使奇数位于偶数前面
 *      题目描述 ：
 *          输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 *          使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 *          并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Sooolution {
    /**
     * 其实还好啦不过感觉新开辟了一个数组有点…不够智能（？
     */
    public static void reOrderArray(int [] array) {
        int[] temp = array.clone();
        int index = 0;
        for(int i = 0; i < temp.length; i++) {
            if(temp[i] % 2 != 0) {
                array[index++] = temp[i];
            }
        }
        for(int i = 0; i < temp.length; i++) {
            if(temp[i] % 2 == 0) {
                array[index++] = temp[i];
            }
        }
    }
}
