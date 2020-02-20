package _20200220;

/**
 * @author yuanyiwen
 * @create 2020-02-20 10:23
 * @description 矩形覆盖
 *      题目描述 :
 *          我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 *          请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class Soooolution {
    /**
     * 几种斐波拉契的区别 ：
     *      7. 斐波拉契数列 ：这个是1,1,2,3,5,8,...
     *      8. 跳台阶 ：这个是 1,2,3,5,8,...；但测试用例中没有 target==0 的情况（但其实最好还是要加上 0 校验
     *     10. 矩形覆盖 ：这个是 1,2,3,5,8,...；且测试用例中存在 target==0 的情况，所以必须加上 0 校验
     */
    public int RectCover(int target) {
        if(target == 0) {
            return 0;
        }
        int p1 = 1, p2 = 1;
        while(target-- > 0) {
            p2 = p2 + p1;
            p1 = p2 - p1;
        }
        return p1;
    }
}