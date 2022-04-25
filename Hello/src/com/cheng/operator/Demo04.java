package com.cheng.operator;

public class Demo04 {
    public static void main(String[] args) {
        //++ -- 自增，自减，一元运算
        int a =3;
        int b = a++;//a++:a=a+1 执行完这行代码之后，先给b赋值，再自增
        //a++表示在此处有个隐藏代码
        //++a表示在此处有个隐藏代码
        int c = ++a;//++a:a=a=1 执行完这行代码之前，先自增，再给c赋值

        System.out.println(a);//5
        System.out.println(b);//3
        System.out.println(c);//5
        //自减与自增一样
        //幂运算 使用工具类操作，运算会使用工具
        double pow = Math.pow(3,2);//3的2次方
        System.out.println(pow);//9
    }
}
