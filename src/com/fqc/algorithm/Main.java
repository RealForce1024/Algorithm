package com.fqc.algorithm;

public class Main {

    public static void main(String[] args) {
        //write your code here
        int i = test();
        System.out.println(i);//0
    }
    //一优酷面试官问的垃圾问题,实际中有人这样写?
    private static int test() {
        int i = 0;
        try {
            return i;
        } catch (Exception ex) {

        } finally {
            i++;
        }
        return i;
    }


}
