package _20200307;

import java.util.ArrayList;

/**
 * @author yuanyiwen
 * @create 2020-03-09 20:53
 * @description 桶排序
 */
public class BucketSort {
    public static ArrayList<Integer> bucketSort(ArrayList<Integer> array, int bucketSize) {
        if (array == null || array.size() < 2)
            return array;
        int max = array.get(0), min = array.get(0);
        // 找到最大值最小值
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > max)
                max = array.get(i);
            if (array.get(i) < min)
                min = array.get(i);
        }
        // 桶数量
        int bucketCount = (max - min) / bucketSize + 1;
        ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>(bucketCount);
        ArrayList<Integer> resultArr = new ArrayList<>();
        // 构造桶
        for (int i = 0; i < bucketCount; i++) {
            bucketArr.add(new ArrayList<>());
        }
        // 将元素装入桶中
        for (int i = 0; i < array.size(); i++) {
            bucketArr.get((array.get(i) - min) / bucketSize).add(array.get(i));
        }
        // 依次对桶中元素进行排序
        for (int i = 0; i < bucketCount; i++) {
            if (bucketSize == 1) {
                resultArr.addAll(bucketArr.get(i));
            } else {
                if (bucketCount == 1) {
                    bucketSize--;
                }
                // 这里是采用的递归的方法进行排序
                ArrayList<Integer> temp = bucketSort(bucketArr.get(i), bucketSize);
                resultArr.addAll(temp);
            }
        }
        return resultArr;
    }
}
