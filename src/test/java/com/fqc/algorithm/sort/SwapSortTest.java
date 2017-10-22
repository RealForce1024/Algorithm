package com.fqc.algorithm.sort;

import org.junit.Test;

public class SwapSortTest {
    @Test
    public void sort() throws Exception {
        int[] arr = {1, 4, 2, 8, 6};
        int[] sorted_arr = SwapSort.sort(arr);
        for (int element : sorted_arr) {
            System.out.println(element);
        }
    }

}