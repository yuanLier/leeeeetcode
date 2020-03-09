package _20200307;

import java.util.ArrayList;

/**
 * @author yuanyiwen
 * @create 2020-03-09 21:19
 * @description
 */
public class RadixSort {
    public void RadixSort(int[] arr) {

        if (arr == null || arr.length < 2) {
            return;
        }

        // 首先计算出最大数的位数
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int maxDigit = 0;
        while (max != 0) {
            max /= 10;
            maxDigit++;
        }
        int mod = 10, div = 1;

        // 然后对每一位进行计数排序
        ArrayList<ArrayList<Integer>> bucketList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            bucketList.add(new ArrayList<>());
        }
        for(int i = 0; i < maxDigit; i++, mod *= 10 , div *= 10){
            for (int value : arr) {
                int num = (value % mod) / div;
                bucketList.get(num).add(value);
            }
            int index = 0;
            for (ArrayList<Integer> integers : bucketList) {
                for (Integer integer : integers) {
                    arr[index++] = integer;
                }
                integers.clear();
            }
        }
    }
}
