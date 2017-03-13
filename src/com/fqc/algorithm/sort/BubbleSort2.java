package com.fqc.algorithm.sort;

/**
 * Created by fqc on 7/15/16.
 */
public class BubbleSort2 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 0, 8};
        int temp = 0; //临时存放变量

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
