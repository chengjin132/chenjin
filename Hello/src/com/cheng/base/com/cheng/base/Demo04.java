package com.cheng.base.com.cheng.base;

public class Demo04 {
    public static void main(String[] args) {
    /*
       操作比较大的数的时候，注意溢出问题
       jdk新特性，数字之间可以用下划线分割
         */
        int money = 10_0000_0000;
        int years = 20;
       /*
        int total = money*years; -1474836480,计算的时候溢出
        long total2 = money*years; 默认是int,转换之前已经存在问题
        */
        long total3 = money * ((long) years);//先把一个数转化为lo
        // ng。
        System.out.println(total3);

    }
}
