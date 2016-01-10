package com.fqc.algorithm.sequence_list.impl;

import com.fqc.algorithm.sequence_list.List;

/**
 * Created by fqc on 2016/1/9.
 */
public class SequenceList implements List{


    static final int defaultSize = 10;
    int size;
    int maxSize;
    Object[] objects;

    public SequenceList() {
        this(defaultSize);
    }

    public SequenceList(int size) {
        this.init(size);
    }

    public void init(int size) {
        this.size = size;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void insert(int index, Object obj) throws Exception {

    }

    @Override
    public Object get(int index) throws Exception {
        return null;
    }

    @Override
    public void delete(int index) throws Exception {

    }
}
