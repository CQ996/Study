package august.ba0801.virtualLife;

import java.util.Scanner;

/**
 * @ClassName Game
 * @Description TODO
 * @Author CQ
 * @Date 2022/7/31 23:13
 * @Version 1.0
 */
public class Game {
    Player player=new Player();
    Scanner input=new Scanner(System.in);
    int choice;//选择菜单

    //存储菜单选项的数组
    //int[] ops;

    //实现游戏的初始化操作
    public void initial(){
        System.out.println("*********玩家可选操作列表*********");
        System.out.println("\t\t1、打工中心");
        System.out.println("\t\t2、我的小窝");
        System.out.println("\t\t3、你好商店");
        System.out.println("\t\t4、恢复体力");
        System.out.println("\t\t5、查看状态");
        System.out.println("\t\t6、终止游戏");
        System.out.println("请输入你的选择：");
        choice=input.nextInt();
        startGame();
    }
    //使用do-while循环结构实现主菜单的操作控制
    public void startGame(){
        boolean result = false;
        do{
            switch (choice){
                case 1:
                    System.out.println("*********欢迎来到【打工中心】*********");
                    player.doWork(choice);
                    break;
                case 2:
                    System.out.println("*********欢迎回到【我的小窝】*********");
                    player.decorate();
                    break;
                case 3:
                    System.out.println("*********欢迎来到【你好商店】*********");
                    player.goShopping();
                    break;
                case 4:
                    System.out.println("*********欢迎来到【恢复体力】*********");
                    player.rest();
                    break;
                case 5:
                    System.out.println("*********欢迎来到【查看状态】*********");
                    player.showStatus();
                    break;
                case 6:
                    System.out.println("游戏结束！");
                    break;
                default:
                    System.out.println("没有该选项哦？请重新输入！");
                    result=true;
                    break;
            }
        }while (result);
        initial();
    }

}
