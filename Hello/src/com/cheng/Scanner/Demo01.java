package com.cheng.Scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {

        //创建一个扫描器对象，用于接收数据
        Scanner scanner = new Scanner(System.in);//AIt+回车
        System.out.println("使用next方式接收：");

        //判断用户有没有输入字符串
        if (scanner.hasNext()){
            //使用next方式接收
            String str =scanner.next();
            System.out.println("输入的内容为："+str);//输入hello world 输出为hello
            /*
            next():对输入有效字符之前遇到的空白，next()方法会自动将其自动去掉
            next():只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符
            next()不能得到带有空格的字符串
            next()一定要读取到有取字符后才可以结束输入
             */

            //凡是属于IO流的类如果不关闭会一直占用资源，所以要关掉 IO流是输入输出的，与电脑打交道的
            scanner.close();//close：关闭，结束
        }

    }
}
