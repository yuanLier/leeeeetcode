package _20200219;

/**
 * @author yuanyiwen
 * @create 2020-02-19 14:32
 * @description 旋转数组的最小数字
 *      题目描述 ：
 *          把一个数组最开始的若干个元素搬到数组的末尾，
 *          我们称之为数组的旋转。
 *          输入一个非递减排序的数组的一个旋转，
 *          输出旋转数组的最小元素。
 *          例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，
 *          该数组的最小值为1。
 *          NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class Sooolution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0) {
            return 0;
        }
        int left = 0, right = array.length-1;
        while(left < right) {
            // 如果左边小于右边，只可能左边是顺序的开始，那么就直接返回左边
            if (array[left] < array[right]) {
                return array[left];
            }
            int mid = left + (right-left) >> 1;
            // 如果中间大于左边，说明左边是按序的，那么异常在右边，于是去掉左半部分
            if(array[mid] > array[left]) {
                left = mid+1;
                // 如果中间小于右边，说明右边是按序的，那么异常在左边，于是去掉右半部分
            } else if(array[mid] < array[right]) {
                right = mid;
                // 否则，只可能是 mid == left == right；为了避免（2 1 2 2 2）这种情况，我们令 left++
            } else {
                left++;
            }
        }
        return array[left];
    }
}
