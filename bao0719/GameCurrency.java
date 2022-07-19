package bao0719;

import java.util.Scanner;

/**
 * @ClassName GameCurrency
 * @Description 玩游戏并支付游戏币
 * @Author CQ
 * @Date 2022/7/19 9:57
 * @Version 1.0
 */
public class GameCurrency {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double price =0.0;
        double zk=0.0;
        String type="";
        System.out.println("青鸟游戏平台>游戏币支付");
        System.out.println("请选择您玩的游戏类型：");
        System.out.println("\t1、牌类\n\t2、休闲竞技类");
        int game=input.nextInt();
        if(game==1){
            type="牌类";
            price =10.0;
        }else if(game==2){
            type="休闲竞技类";
            price =20.0;
        }
        System.out.println("请您输入游戏时长：");
        double time=input.nextDouble();
        if(time>=10){
            zk=0.5;
        }else {
            zk=0.8;
        }
        double money=price*time*zk;
        System.out.println("您玩的是"+type+"游戏，时长是："+time+"小时，可以享受"+zk+"折优惠");
        System.out.println("您需要支付"+money+"个游戏币");
    }
}
