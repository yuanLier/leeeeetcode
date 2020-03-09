package _20200307;

/**
 * @author yuanyiwen
 * @create 2020-03-08 13:39
 * @description 插入排序
 */
public class InsertSort {
    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            // 取无序部分的第一个元素
            int cur = arr[i + 1];
            // index 指向有序部分的最后一个元素
            int index = i;
            // 依次移动有序部分的元素，直到找到 cur 应在的位置
            while (index >= 0 && cur < arr[index]) {
                arr[index + 1] = arr[index--];
            }
            arr[index + 1] = cur;
        }
    }
}
