package com.cheng.Scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextLine方式接受：");
        String str =scanner.nextLine();
        System.out.println("输入内容为："+str);


        scanner.close();

    }
}
