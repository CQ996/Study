package bao0726.mora;

import java.util.Scanner;

/**
 * @ClassName Game
 * @Description 猜拳游戏——开始游戏类
 * @Author CQ
 * @Date 2022/7/27 8:34
 * @Version 1.0
 */
public class Game {
    User user=new User();
    Computer computer=new Computer();
    Scanner input=new Scanner(System.in);
    int select;
    String cpname;
    String name;
    String answer;
    int num;
    int win1;
    int win2;
    //初始化游戏
    public void initial(){
        System.out.println("********欢迎进入游戏世界********");
        System.out.print("\n");
        System.out.println("*****************************");
        System.out.println("*****\t猜拳，开始\t******");
        System.out.println("*****************************");
    }
    //开始游戏
    public void startGame(){
        System.out.println("出拳规则：1、剪刀\t2、石头\t3、布");
        System.out.print("请选择对方角色：（1：刘备\t2：孙权\t3：曹操）:");
        select=input.nextInt();
        switch (select){
            case 1:
                cpname="刘备";
                break;
            case 2:
                cpname="孙权";
                break;
            case 3:
                cpname="曹操";
                break;
        }
        System.out.print("请输入你的姓名：");
        name= input.next();
        System.out.print("你选择了"+cpname+"对战！");
    }
    //比较得分
    public void showResult(){
            System.out.print("要开始吗？");
            answer=input.next();
            while (answer.equals("y")){
                user.showFist();
                System.out.println("你出拳："+user.mora);
                computer.showFist();
                System.out.println(cpname+"出拳："+computer.mora);
                if(user.select==3){
                    if(computer.random==2){
                        System.out.println("结果：你赢了");
                        win1++;
                        win2--;
                    }else if(computer.random==1){
                        System.out.println("结果：你输了");
                        win1--;
                        win2++;
                    }else {
                        System.out.println("结果：这把平局！");
                    }
                }else if(user.select==2){
                    if(computer.random==2){
                        System.out.println("结果：这把平局！");
                    }else if(computer.random==1){
                        System.out.println("结果：你赢了");
                        win1++;
                        win2--;
                    }else {
                        System.out.println("结果：你输了");
                        win1--;
                        win2++;
                    }
                }else if(user.select==1){
                    if(computer.random==2){
                        System.out.println("结果：你输了");
                        win1--;
                        win2++;
                    }else if(computer.random==1){
                        System.out.println("结果：这把平局！");
                    }else {
                        System.out.println("结果：你赢了");
                        win1++;
                        win2--;
                    }
                }
                num++;
                System.out.print("是否开始下一轮？");
                answer=input.next();
            }
            System.out.println(cpname+"VS"+name);
            System.out.println("对战次数："+num);
            System.out.println("姓名：\t得分:");
            System.out.println(name+"\t"+win1);
            System.out.println(cpname+"\t"+win2);
            if(win1>win2){
                System.out.print("恭喜！恭喜！");
            }else if(win1==win2){
                System.out.print("你们平局！");
            }else {
                System.out.print("真遗憾！你输了！");
            }
        }

}
