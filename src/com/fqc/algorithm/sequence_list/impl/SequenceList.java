package com.fqc.algorithm.sequence_list.impl;

import com.fqc.algorithm.sequence_list.List;

/**
 * Created by fqc on 2016/1/9.
 * 顺序结构实现线性表
 */
public class SequenceList implements List{

    final int defaultSize = 10;
    int maxSize;
    //当前长度
    int size;
    //对象数组(保存当前对象)
    Object[] listArray;

    public SequenceList() {
        init(defaultSize);
    }

    public void init(int size){
        maxSize = size;
        size = 0;
        listArray = new Object[maxSize];
    }

    public SequenceList(int size) {
        init(size);
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void insert(int index, Object obj) throws Exception {
	    if(size==maxsize){
		    return new Exception("顺序表已满，无法插入")
	    }
	    if(index < 0 || index > size){
		    return new Exception("插入位置异常")
	    for(int j = size;j>index;j--){
		    listArray[j]=listArray[j-1];
	    }
	    listArray[index] = obj;
	    size++;
    }

    @Override
    public Object get(int index) throws Exception {
        return null;
    }

    @Override
    public void delete(int index) throws Exception {

    }
}
