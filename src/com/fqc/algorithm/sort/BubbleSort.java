package com.fqc.algorithm.sort;

/**
 * Created by fqc on 6/9/16.
 * 冒泡排序（Bubble Sort）是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，
 * 如果他们的顺序错误就把他们交换过来。走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
 * 这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
 */
public class BubbleSort {
    /*基本思想：在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，
    让较大的数往下沉，较小的往上冒。即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。*/
    public static void main(String[] args) {
        int[] arrs = {1, 3, 5, 2, 4, 6};
        int temp = 0; //temp作为临时变量,方便大数向后交换

        for (int i = 0; i < arrs.length - 1; i++) {   //arrs.length-1 ->要排序的次数
            for (int j = 0; j < arrs.length - 1 - i; j++) { // arrs.length - 1 - i ->未完成排序的次数
                if (arrs[j] > arrs[j + 1]) {
                    temp = arrs[j];
                    arrs[j] = arrs[j + 1];
                    arrs[j + 1] = temp;
                }
            }
        }

        for (int arr : arrs) {
            System.out.println(arr);
        }


    }
}
