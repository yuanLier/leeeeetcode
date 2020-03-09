package _20200307;

/**
 * @author yuanyiwen
 * @create 2020-03-08 11:33
 * @description 选择排序
 */
public class SelectionSort {
    public void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            int index = i;
            for(int j = i; j < arr.length; j++) {
                if(arr[j] < arr[index]) {
                    index = j;
                }
            }
            if(index != i) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
