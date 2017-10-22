package com.fqc.algorithm.sort;

import java.util.Arrays;

/**
 * 交换排序
 * 基本原理是从头拿出序列中的元素和剩余的元素一一比较，符合条件则进行交换。
 * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
 *
 * @author fqc
 */
public class SwapSort {

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println("第" + (i + 1) + "次排序: " + Arrays.toString(arr));
        }
        return arr;
    }

}
