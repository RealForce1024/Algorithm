package com.fqc.algorithm.util;

/**
 * @author fqc
 */
public final class SortUtils {
    private SortUtils() {
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void iterate(int[] arr) {
        for (int element : arr) {
            System.out.println(element);
        }
    }
}
