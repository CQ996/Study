package bao0722;

import java.util.Scanner;

/**
 * @ClassName FreeXia
 * @Description 自由虾平台菜单联动
 * @Author CQ
 * @Date 2022/7/22 16:05
 * @Version 1.0
 */
public class FreeXia {
    Scanner input=new Scanner(System.in);
    String name="极火虾";
    int password=0000;
    int xiaminum=12345;
    String birthday="2002/10/08";
    int xiabimun=500;
    int choice1;
    String answer="";
    //显示登录菜单
    public void showLonginMenu(){
        System.out.println("1、虾米登录");
        System.out.println("2、虾米注册");
        System.out.println("3、退出");
        System.out.println("*********************");
        System.out.println("请选择，输入数字（1~3）：");
        choice1=input.nextInt();
        switch (choice1){
            case 1:
                do{
                    System.out.println("请输入昵称：");
                    String inputname=input.next();
                    System.out.println("请输入密码：");
                    int inputpass=input.nextInt();
                    if(inputname.equals(name) && inputpass==password){
                        System.out.println("登录成功！");
                        showManinMenu();
                        showTravel();
                    }else {
                        System.out.println("您的账号有误，请重新输入：");
                        answer="y";
                    }
                }while (answer.equals("y"));


                break;
            case 2:
                System.out.println("执行虾米注册");
                break;
            case 3:
                System.out.println("执行退出");
                break;
            default:
                System.out.println("您的输入有误");
        }
    }

    //显示会员信息
    public void showManinMenu(){
        System.out.println("您的会员信息：");
        System.out.println("虾米号："+xiaminum+"\t\t"+"昵称："+name+"\t密码："+password+"\t生日："+birthday+"\t虾币数："+xiabimun);
    }

    int choice2;
    //显示去哪儿游菜单
    public void showTravel(){
        System.out.println("*********************");
        System.out.println("1、去哪儿游");
        System.out.println("2、虾游商城");
        System.out.println("3、个人中心");
        System.out.println("4、虾神俱乐部");
        System.out.println("请选择，（1~4），按0返回上一级：");
        choice2=input.nextInt();
        switch (choice2){
            case 0:
                showLonginMenu();
                break;
            case 1:
                System.out.println("执行去哪儿游");
                break;
            case 2:
                showShop();
                break;
            case 3:
                System.out.println("执行个人中心");
                break;
            case 4:
                System.out.println("执行虾神俱乐部");
                break;
            default:
                System.out.println("您的输入有误");

        }
    }

    int choice3;
    //显示虾游商城菜单
    public void showShop(){
        System.out.println("*********虾神商城*******");
        System.out.println("1、线路浏览");
        System.out.println("2、打印行程单");
        System.out.println("3、促销活动");
        System.out.println("4、退费规则");
        System.out.println("5、订单结算");
        System.out.println("*********************");
        System.out.println("请选择，（1~5），按0返回上一级：");
        choice3=input.nextInt();
        switch (choice3){
            case 0:
                showTravel();
                break;
            case 1:
                System.out.println("执行线路浏览");
                break;
            case 2:
                System.out.println("执行打印行程单");
                break;
            case 3:
                System.out.println("执行促销活动");
                break;
            case 4:
                System.out.println("执行退费规则");
                break;
            case 5:
                System.out.println("执行订单结算");
                break;
            default:
                System.out.println("您的输入有误");
        }
    }


    //显示个人中心菜单
    //showCenter(){}
    //显示虾神俱乐部菜单
    //showClub(){}

}
