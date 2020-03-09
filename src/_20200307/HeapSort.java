package _20200307;

/**
 * @author yuanyiwen
 * @create 2020-03-09 19:52
 * @description 堆排序
 */
public class HeapSort {
    /**
     * 调整最大堆
     */
    public void heapAdjust(int[] arr, int index, int length){
        //保存当前结点的下标
        int max = index;
        //当前节点左子节点的下标
        int lchild = 2*index;
        //当前节点右子节点的下标
        int rchild = 2*index + 1;
        if(length > lchild && arr[max] < arr[lchild]){
            max = lchild;
        }
        if(length > rchild && arr[max] < arr[rchild]){
            max = rchild;
        }
        //若此节点比其左右孩子的值小，就将其和最大值交换，并调整堆
        if(max != index){
            int temp = arr[index];
            arr[index] = arr[max];
            arr[max] = temp;
            heapAdjust(arr, max, length);
        }
    }

    /**
     * 堆排序
     */
    public int[] heapSort(int[] arr){
        int len = arr.length;
        //初始化堆，构造一个最大堆
        for(int i = (len / 2 - 1); i >= 0; i--){
            heapAdjust(arr, i, len);
        }
        //将堆顶的元素和最后一个元素交换，并重新调整堆
        for(int i = len-1; i > 0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapAdjust(arr, 0, i);
        }
        return arr;
    }
}
