package bao0719;

import java.util.Scanner;

/**
 * @ClassName SelectGame
 * @Description 输入数字选择游戏
 * @Author CQ
 * @Date 2022/7/19 8:54
 * @Version 1.0
 */
public class SelectGame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("欢迎进入青鸟游戏平台\n");
        System.out.println("请选择您喜爱的游戏：\n");
        String num1="斗地主";
        String num2="斗牛";
        String num3="泡泡龙";
        String num4="连连看";
        System.out.println("***********************");
        System.out.println("1、"+num1);
        System.out.println("2、"+num2);
        System.out.println("3、"+num3);
        System.out.println("4、"+num4);
        System.out.println("***********************");
        System.out.print("请选择，输入数字：");
        int num=input.nextInt();
        switch (num){
            case 1:
                System.out.println("您已进入"+num1+"房间！");
                break;
            case 2:
                System.out.println("您已进入"+num2+"房间！");
                break;
            case 3:
                System.out.println("您已进入"+num3+"房间！");
                break;
            case 4:
                System.out.println("您已进入"+num4+"房间！");
                break;
            default:
                System.out.println("您的输入有误！");
        }



    }

}
