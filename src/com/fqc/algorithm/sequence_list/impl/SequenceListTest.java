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
        sequenceList.insert(sequenceList.size,new Student("zhangsan",20));
        sequenceList.insert(sequenceList.size,new Student("zhangsan",21));
        sequenceList.insert(sequenceList.size,new Student("zhangsan",23));
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

        System.out.println(sequenceList.size);
    }

    @Test
    public void testIsEmpty() throws Exception {

        System.out.println(sequenceList.isEmpty());
    }

    @Test
    public void testInsert() throws Exception {
        sequenceList.insert(sequenceList.size,new Student("zhangsan",20));
        sequenceList.insert(sequenceList.size,new Student("zhangsan",20));
        sequenceList.insert(sequenceList.size,new Student("zhangsan",20));
    }

    @Test
    public void testGet() throws Exception {


        /*for (Object o : sequenceList) {
            System.out.println(o);
        }*/
        for (int i = 0; i < sequenceList.size; i++) {
            System.out.println(sequenceList.listArray[i]);
        }
    }

    @Test
    public void testDelete() throws Exception {
        sequenceList.delete(2);
        for (int i = 0; i < sequenceList.size; i++) {
            System.out.println(sequenceList.listArray[i]);
        }
    }
}