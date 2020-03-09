package _20200307;

import java.util.Arrays;

/**
 * @author yuanyiwen
 * @create 2020-03-08 23:01
 * @description 归并排序
 */
public class MergeSort {
    /**
     * 采用归并的方法对无序数组进行排序
     */
    public int[] MergeSort(int[] arr){
        if(arr.length < 2){
            return arr;
        }
        int mid = arr.length / 2;
        // 将数组分为左右两部分
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        // 对左右分别进行排序，然后合并
        return merge(MergeSort(left), MergeSort(right));
    }

    /**
     * 合并两个有序数组
     */
    public int[] merge(int[] left, int[] right){
        int[] res = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < res.length; index++) {
            // 前两个分支考虑的是是其中一个数组遍历完了的情况
            if (i >= left.length) {
                res[index] = right[j++];
            } else if (j >= right.length) {
                res[index] = left[i++];
            // 后两个分支直接合并，谁小谁在前
            } else if (left[i] < right[j]) {
                res[index] = right[i++];
            } else {
                res[index] = left[j++];
            }
        }
        return res;
    }
}
