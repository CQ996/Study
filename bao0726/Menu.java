package bao0726;

import java.util.Scanner;

/**
 * @ClassName Menu
 * @Description 菜单类，实现菜单的级联效果
 * @Author CQ
 * @Date 2022/7/26 13:41
 * @Version 1.0
 */
public class Menu {
    Scanner input=new Scanner(System.in);
    int select;
    String name;
    int password;
    //显示登录菜单
    public void showLoginMenu(){
        System.out.println("欢迎使用我行我素购物管理系统");
        System.out.println("\t\t1、登录系统");
        System.out.println("\t\t2、退出");
        System.out.println("请选择，输入数字：");
        select=input.nextInt();
        switch (select){
            case 1:
                StartSMS();
                break;
            case 2:
                System.out.println("执行退出！");
                break;
        }
    }
    //输入用户名和密码正确进入系统
    public void StartSMS(){
        while (2>1){
            System.out.println("请输入用户名：");
            name= input.next();
            System.out.println("请输入密码：");
            password= input.nextInt();
            if(name.equals("程前") && password==111111){
                showMainMenu();
                break;
            }else {
                System.out.println("你没有权限进入系统，请重新输入：");
            }
        }
    }
    //显示主菜单
    public void showMainMenu(){
        System.out.println("我行我素购物管理系统主菜单");
        System.out.println("\t\t1、客户信息管理");
        System.out.println("\t\t2、真情回馈");
        System.out.println("请选择，输入数字或输0返回上一级菜单：");
        select=input.nextInt();
        switch (select){
            case 0:
                showLoginMenu();
                break;
            case 1:
                showCustMenu();
                break;
            case 2:
                showSendMenu();
                break;
        }
    }
    //显示客户信息管理菜单
    public void showCustMenu(){
        System.out.println("我行我素购物管理系统>客户信息管理");
        System.out.println("\t\t1、******");
        System.out.println("\t\t2、******");
        System.out.println("\t\t3、******");
        System.out.println("请选择，输入数字或输0返回上一级菜单：");
        select=input.nextInt();
        switch (select){
            case 0:
                showMainMenu();
                break;
            case 1:
                System.out.println("执行幸运大放送");
                break;
            case 2:
                System.out.println("执行幸运抽奖");
                break;
            case 3:
                System.out.println("执行生日问候");
                break;
        }
    }
    //实现显示真情回馈菜单
    public void showSendMenu(){
        System.out.println("我行我素购物管理系统>真情回馈");
        System.out.println("\t\t1、幸运大放送");
        System.out.println("\t\t2、幸运抽奖");
        System.out.println("\t\t3、生日问候");
        System.out.println("请选择，输入数字或输0返回上一级菜单：");
        select=input.nextInt();
        switch (select){
            case 0:
                showMainMenu();
                break;
            case 1:
                System.out.println("执行幸运大放送");
                break;
            case 2:
                System.out.println("执行幸运抽奖");
                break;
            case 3:
                System.out.println("执行生日问候");
                break;
        }
    }


}
