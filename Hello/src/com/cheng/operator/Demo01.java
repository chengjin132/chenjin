package com.cheng.operator;

public class Demo01 {
    public static void main(String[] args) {
        //二元运算
        //Ctrl+D ：复制当前行到下一行
        int a = 10;
        int b= 20;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/(double)b);//a/b为小数，a,b为int类型，所以此处要强转为浮点类型
        //System.out.println(a/b);//a,b为int类型，所以a/b的结果会摄取小数部分，因此为0
    }
}
