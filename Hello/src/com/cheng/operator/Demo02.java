package com.cheng.operator;
import com.cheng.base.Demo04; //导入包；import 定义包；package
public class Demo02 {
    public static void main(String[] args){
        long a = 13123123123123L;
        int b = 123;
        short c = 10;
        byte d = 8;
        System.out.println(a+b+c+d);//long 2个数或者多个数操作时，有一个数为Long时，输出结果业务为long类型
        System.out.println(b+c+d);//int 2个数或者多个数操作时，没有long时,输出结果就为int类型
        System.out.println(c+d);//int
        //2个数或者多个数操作时，有一个数为double时，输出结果为double类型
    }

}
