package com.fqc.algorithm.sort;

import com.fqc.algorithm.util.SortUtils;
import org.junit.Test;

public class BubbleSortTest {
    @Test
    public void main() throws Exception {
        int[] arr = {1, 3, 5, 2, 4, 6};
        BubbleSort.sort(arr);
        SortUtils.iterate(arr);
    }
}