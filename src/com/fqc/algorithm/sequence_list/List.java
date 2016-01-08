package com.fqc.algorithm.sequence_list;

/**
 * Created by fqc on 2016/1/9.
 */

public interface List {

    int size();

    boolean isEmpty();

    void insert(int index, Object obj) throws Exception;

    Object get(int index) throws Exception;

    void delete(int index) throws Exception;


}
