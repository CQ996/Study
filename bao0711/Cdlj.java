package bao0711;

import java.util.Scanner;

public class Cdlj {
    public static void main(String[] args) {
        System.out.println("哪里好吃、好玩、好看、好拍照？快来自由虾旅行平台");
        System.out.println("\t\t1、虾米登录");
        System.out.println("\t\t2、虾米注册");
        System.out.println("\t\t3、退出");
        System.out.println("**************************");
        Scanner input=new Scanner(System.in);
        System.out.println("请选择（1~3）：");
        int num=input.nextInt();
        switch (num){
            case 1:
                System.out.println("进入主菜单");
                break;
            case 2:
                System.out.println("进入注册功能");
                break;
            case 3:
                System.out.println("欢迎再来，一路有你！");
                break;
            default:
                System.out.println("您的输入有误！");
                break;

        }
    }
}
