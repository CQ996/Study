package bao0727;

import java.util.Scanner;

/**
 * @ClassName Demo1
 * @Description 字符串长度;字符串比较忽略大小写;字符串查找位置；字符串查找截取值；
 * @Author CQ
 * @Date 2022/7/27 14:05
 * @Version 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*
        String name1="anhuisheng";
        String names="TOM";
        int pwds=111111;
        System.out.println("字符串长度"+name1.length());
        System.out.println("******登录功能******");
        System.out.println("请输入用户名：");
        String name=input.next();
        System.out.println("请输入密码：");
        int pwd=input.nextInt();

        //忽略大小写进行比较
        if(name.equalsIgnoreCase(names) && pwd==pwds){
            System.out.println("注册成功！");
        }else {
            System.out.println("注册失败！");
        }

        //转换为小写再进行比较
        if(name.toLowerCase().equals(names.toLowerCase())){
            System.out.println("注册成功！");
        }
        //转换为大写再进行比较
        if(name.toUpperCase().equals("TOM")){
            System.out.println("注册成功！");
        }
        */

        System.out.println("请输入用户名：");
        String name=input.next();
        //indexOf位置查找，存在就是当前位置，不存在就是-1
        int index=name.indexOf("a",5);//从第5个位置找
        //1.pdf
        System.out.println(index);
        //substring 查找截取值
        String a=name.substring(3,8);//开始位置从0开始数，结束位置从1开始计数;这里相当于截取3~7位
        //String a=name.substring(3);从0，1，2，3；3开始找到最后
        System.out.println(a);
        //name.trim();去掉字符串两边的空格

        /*
        获取尾椎名
        String a=name.substring(index+1);
        System.out.println(a);
        if (index!=-1&&name.substring(index+1).equals(".")){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
        }
        */
    }
}
