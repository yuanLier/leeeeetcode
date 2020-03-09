package _20200307;

import java.util.Arrays;

/**
 * @author yuanyiwen
 * @create 2020-03-09 20:16
 * @description 计数排序
 */
public class CountingSort {
    /**
     * 计数排序
     * @param arr 该数组中存放的数据都在已知范围内
     * @param max 范围的最大值
     * @param min 范围的最小值
     */
    public static void countingSort(int[] arr, int max, int min){
        // 偏差
        int bias = 0 - min;
        // 新开辟一个数组，并将数据依次存入新数组
        int[] bucket = new int[max - min +1];
        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i] + bias]++;
        }

        // 将新数组中的数据依次取出，再放回原数组
        int index = 0;
        for (int i = 0; i < bucket.length; i++){
            int len = bucket[i];
            while (len-- > 0) {
                arr[index++] = i - bias;
            }
        }
    }
}
