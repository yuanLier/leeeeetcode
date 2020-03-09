package _20200307;

/**
 * @author yuanyiwen
 * @create 2020-03-07 17:05
 * @description 冒泡排序
 */
public class BubbleSort {
    public void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            // 每一轮都把前 arr.length-1-i 中最大的数放到最后一个位置上
            for(int j = 0; j < arr.length-1-i; j++) {
                // 如果前一个比后一个大，就交换它们两个
                if(arr[j] > arr[j+1]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}