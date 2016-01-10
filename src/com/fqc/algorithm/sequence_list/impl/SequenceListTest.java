package com.fqc.algorithm.sequence_list.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fqc on 2016/1/10.
 */
public class SequenceListTest {

    SequenceList sequenceList;
    @Before
    public void init() {
       sequenceList = new SequenceList();
    }

    @Test
    public void testIsEmpty() throws Exception {
        System.out.println(sequenceList.isEmpty());
    }

    @Test
    public void testSize() throws Exception {
        System.out.println(sequenceList.size());
    }
}