package com.fqc.algorithm.sort;

import com.fqc.algorithm.util.SortUtils;

import java.util.Arrays;

/**
 * 冒泡排序（Bubble Sort）是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，
 * 如果他们的顺序错误就把他们交换过来。走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
 * 这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
 *
 * @author fqc
 */
public class BubbleSort {
    /**
     * 基本思想：在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，
     * 让较大的数往下沉，较小的往上冒。即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
     */
    public static void sort(int[] arr) {
        // arr.length-1 ->要排序的次数
        for (int i = 0; i < arr.length - 1; i++) {
            // arr.length - 1 - i ->未完成排序的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    SortUtils.swap(arr, j, j + 1);
                }
            }
            System.out.println("第" + (i + 1) + "次排序: " + Arrays.toString(arr));
        }
    }
}
