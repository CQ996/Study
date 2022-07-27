package bao0726.com.game;

import java.util.Scanner;

/**
 * @ClassName Member
 * @Description 会员充值和消费
 * @Author CQ
 * @Date 2022/7/26 23:44
 * @Version 1.0
 */
public class Member {
    Scanner input=new Scanner(System.in);
    //选择
    int select;
    //充值金额
    double money1;
    //消费
    double money2;
    //余额
    double money=0.0;
    //创建业务选择方法
    public void business(){
        System.out.println("1、充值\t2、消费\t0、退出");
        System.out.print("请选择你需要办理的业务：");
        select=input.nextInt();
        switch (select){
            case 0:
                System.out.print("谢谢使用！");
                break;
            case 1:
                recharge();
                break;
            case 2:
                consumption();
                break;
        }
    }
    //创建充值方法
    public void recharge(){
        System.out.print("请输入充值金额（元）：");
        money1=input.nextDouble();
        money+=money1;
        System.out.println("充值成功！");
        System.out.println("*****当前余额为："+money+"*****");
        business();
    }
    //创建消费方法
    public void consumption(){
        System.out.print("请输入消费金额（元）：");
        money2=input.nextDouble();
        money-=money2;
        if(money<0){
            System.out.println("余额不足！");
            money+=money2;
        }else {
            System.out.println("消费成功！");
            System.out.println("*****当前余额为："+money+"*****");
        }
        business();
    }
}
