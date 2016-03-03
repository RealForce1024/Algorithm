package com.fqc.algorithm.sequence_list.impl;

import com.fqc.algorithm.models.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fqc on 2016/1/10.
 */
public class SequenceListTest {

    private  SequenceList sequenceList;

    @Before
    public void setUp() throws Exception {
        sequenceList = new SequenceList(20);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testInit() throws Exception {
        System.out.printf("maxSize:%d,%ndefaultSize:%d",sequenceList.maxSize,sequenceList.defaultSize);
    }


    @Test
    public void testSize() throws Exception {

    }

    @Test
    public void testIsEmpty() throws Exception {

    }

    @Test
    public void testInsert() throws Exception {

    }

    @Test
    public void testGet() throws Exception {

    }

    @Test
    public void testDelete() throws Exception {

    }
}