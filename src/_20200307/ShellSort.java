package _20200307;

/**
 * @author yuanyiwen
 * @create 2020-03-08 17:28
 * @description 希尔排序
 */
public class ShellSort {
    public static void shellSort(int[] arr) {
        int gap = arr.length / 2;
        while (gap > 0) {
            // 这其实就是一个希尔排序，这只是将间隔由 “1” 变成了 “gap”
            for (int i = 0; i < arr.length-gap; i++) {
                int cur = arr[i + gap];
                int index = i;
                while (index >= 0 && cur < arr[index]) {
                    arr[index + gap] = arr[index];
                    index -= gap;
                }
                arr[index + gap] = cur;
            }
            gap /= 2;
        }
    }
 }
