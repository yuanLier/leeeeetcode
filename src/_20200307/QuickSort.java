package _20200307;

/**
 * @author yuanyiwen
 * @create 2020-03-09 11:28
 * @description 快速排序
 */
public class QuickSort {
    public void QuickSort(int[] arr, int left, int right){
        if(left < right) {
            // 对数列进行分区，并获取上一个基准数的下标，也就是这一次操作的分区线
            int partition = partition(arr, left, right);
            // 对左边递归排序
            QuickSort(arr, left, partition-1);
            // 对右边递归排序
            QuickSort(arr, partition+1, right);
        }
    }

    public int partition(int[] arr, int left, int right){
        // 选择范围内的第一个为基准数
        int mark = arr[left];
        while(left < right) {
            // 从后半部分向前扫描，直到找到第一个比 mark 小的数，记为 A
            while(left < right && arr[right] >= mark) right--;
            arr[left] = arr[right];
            // 从前半部分向后扫描，直到找到第一个比 mark 大的数，记为 B
            while(left < right && arr[left] <= mark) left++;
            // 这句联系上句，其实起到的是一个交换 A B 的作用
            arr[right] = arr[left];
        }
        arr[left] = mark;
        return left;
    }
}
