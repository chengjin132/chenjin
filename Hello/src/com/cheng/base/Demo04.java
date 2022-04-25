package com.cheng.base;

public class Demo04 {
    public boolean age;
    public boolean name;
    //实例变量;从属于对象;如果变量不自行初始化，就会输出这个类型的默认值
    //所有的数值类型初始化值一般都是0或者0.0，字符串变量初始化值为16位的0，也就是u0000
    //布尔值初始化值默认为false
    //除了基本类型，其余的数据类型的默认值都为null
    
    
    //类变量;数据类型前加个关键词static为类变量
    static double salary = 2500;
    public static void main(String[] args) {
        //局部变量;在方法里面，必须声明和初始化值
        int i = 10;
        System.out.println(i);

        //变量类型 变量名字 = new Demo04();
        com.cheng.base.Demo04 demo04= new Demo04();
        System.out.println(demo04.age);
        System.out.println(demo04.name);
        System.out.println(salary);
    }
   //其他方法 add方法
    public void aad(){

    }
}
