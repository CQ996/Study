package bao0725;

import java.util.Scanner;

/**
 * @ClassName Player
 * @Description （对战游戏）真人类——真人 vs Ai
 * @Author CQ
 * @Date 2022/7/25 14:07
 * @Version 1.0
 */
public class Player {
    Scanner input=new Scanner(System.in);
    //英雄
    String hero;
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
    //真人攻击方法：
    public int people(){
            additional=0;
            System.out.println("真人发动攻击:");
            System.out.println("请选择你的英雄：A、吕布  B、貂蝉");
            selcet=input.next();
            switch (selcet){
                case "A":
                    hero="吕布";
                    System.out.println("请输入你的招式：A.方天画戟 B.贪狼之仗 C.魔神降临");
                    selcet=input.next();
                    //额外伤害值：招式A为5，招式B为10，招式C为15
                    switch (selcet){
                        case "A":
                            skill="方天画戟";
                            additional=5;
                            break;
                        case "B":
                            skill="贪狼之杖";
                            additional=10;
                            break;
                        case "C":
                            skill="魔神降临";
                            additional=15;
                            break;
                        default:
                            System.out.println("没有这个招式！！");
                    }
                    break;
                case "B":
                    hero="貂蝉";
                    System.out.println("请输入你的招式：A.飞落红雨 B.飘语花印 C.绽放风华");
                    selcet=input.next();
                    switch (selcet){
                        case "A":
                            skill="飞落红雨";
                            additional=5;
                            break;
                        case "B":
                            skill="飘语花印";
                            additional=10;
                            break;
                        case "C":
                            skill="绽放风华";
                            additional=15;
                            break;
                        default:
                            System.out.println("没有这个招式！！");
                    }
                    break;
                default:
                    System.out.println("没有这个英雄！！");
            }
            //随机0~29点的基础伤害
            int basics=(int)(Math.random()*30);
            //总伤害
            hurt=basics+additional;
            System.out.println("你发出【"+skill+"】招式，对AI英雄造成"+hurt+"点伤害。");
            //ai剩余血量
            hp=100-hurt;
            return hp;
    }
    //剩余血量方法
    /*
    public void hp(){
        System.out.println(poeple());
    }
    */
}
