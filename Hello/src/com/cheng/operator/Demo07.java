package com.cheng.operator;

public class Demo07 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a+=b; //a=a=b
        a-=b; //a=a-b

        System.out.println(a);
        //字符串连接符;+ 如果+号左右两边出现string类型 则会把+左由两侧数据类型转化为string类型
        System.out.println(""+a+b); //string类型在+号前面，先转化为string类型再输入结果 1020
        System.out.println(a+b+""); //string类型在+号后面，先执行a+b再转化为string类型，最后输出结果 30
    }
}
