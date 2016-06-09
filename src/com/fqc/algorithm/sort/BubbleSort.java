package com.fqc.algorithm.sort;

/**
 * Created by fqc on 6/9/16.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arrs = {1, 3, 5, 2, 4, 6};
        int temp = 0; //temp作为临时变量,方便大数向后交换

        for (int i = 0; i < arrs.length - 1; i++) {   //arrs.length-1 要排序的次数
            for (int j = 0; j < arrs.length - 1 - i; j++) { //未完成排序的次数
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
