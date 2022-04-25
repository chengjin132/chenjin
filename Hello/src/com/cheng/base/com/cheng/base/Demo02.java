package com.cheng.base.com.cheng.base;

public class Demo02 {
    public static void main(String[] args){
        String sa = new String("hello world");
        String sb = new String("hello world");
        String sc ="hello world";
        String sd ="hello world";
        System.out.println(sa==sb);//false
        System.out.println(sc==sd);//true
        //对象，从内存分析
    }

}
