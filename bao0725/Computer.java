package bao0725;

import java.util.Scanner;

/**
 * @ClassName Computer
 * @Description （对战游戏）Ai类——真人 vs Ai
 * @Author CQ
 * @Date 2022/7/26 8:34
 * @Version 1.0
 */
public class Computer {
    Scanner input=new Scanner(System.in);
    //AI
    String ai;
    //招式
    String skill;
    //选择
    String selcet;
    //招式伤害
    int additional;
    //总伤害
    int hurt;
    //剩余血量
    int hp;
    public int ai(){
            additional=0;
            System.out.println("AI发动攻击:");
            System.out.println("请选择你要对战的英雄：A、赵云  B、诸葛亮");
            selcet=input.next();
            switch (selcet){
                case "A":
                    ai="赵云";
                    System.out.println("请输入你的招式：A.惊云之龙 B.破晓之龙 C.飞天之龙");
                    selcet=input.next();
                    break;
                case "B":
                    ai="诸葛亮";
                    System.out.println("请输入你的招式：A.东风逆袭 B.时空穿越 C.元气之弹");
                    selcet=input.next();
                    break;
                default:
                    System.out.println("没有这个英雄！！");
            }
            if(ai.equals("赵云")){
                switch (selcet){
                    case "A":
                        skill="惊云之龙";
                        additional =5;
                        break;
                    case "B":
                        skill="破晓之龙";
                        additional =10;
                        break;
                    case "C":
                        skill="飞天之龙";
                        additional =15;
                        break;
                    default:
                        System.out.println("没有这个招式！！");
                }
            }else if(ai.equals("诸葛亮")){
                switch (selcet){
                    case "A":
                        skill="东风逆袭";
                        additional =5;
                        break;
                    case "B":
                        skill="时空穿越";
                        additional =10;
                        break;
                    case "C":
                        skill="元气之弹";
                        additional =15;
                        break;
                    default:
                        System.out.println("没有这个招式！！");
                }
            }
            //随机0~29点的基础伤害
            int basics=(int)(Math.random()*30);
            //总伤害
            hurt=basics+additional;
            System.out.println("AI英雄"+ai+"发出【"+skill+"】招式，对你造成"+hurt+"点伤害。");
            //真人剩余血量
            hp=100-hurt;
            return hp;
    }
    //剩余血量方法
    /*
    public void hp(){
        System.out.println(ai());
    }
    */
}
