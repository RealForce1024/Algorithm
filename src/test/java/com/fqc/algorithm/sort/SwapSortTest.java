package com.fqc.algorithm.sort;

import com.fqc.algorithm.util.SortUtils;
import org.junit.Test;

public class SwapSortTest {
    @Test
    public void sort() throws Exception {
        int[] arr = {1, 4, 2, 8, 6};
        SwapSort.sort(arr);
        SortUtils.iterate(arr);
    }

}