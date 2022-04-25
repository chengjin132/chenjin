package com.cheng.Scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextLine方式接受:");
        if (scanner.hasNextLine()){
            String str =scanner.nextLine();
            System.out.println("输出内容为："+str);//输入hello world 输出为hello world
         /*
         nextLine():以后Enter为结束符，也就是说nextLine()方法返回的是输入回车之前的所有字符。
         nextLine()可以获得空白
          */
            scanner.close();
        }

    }
}
