package bao0711;

import java.util.Scanner;

public class Zyx {
    public static void main(String[] args) {
        System.out.println("哪里好吃、好玩、好看、好拍照？快来自由虾旅行平台");
        System.out.println("**************************");
        System.out.println("\t\t1、去哪儿游？");
        System.out.println("\t\t2、虾游商城？");
        System.out.println("\t\t3、个人中心？");
        System.out.println("\t\t4、虾神俱乐部？");
        System.out.println("**************************");
        Scanner input=new Scanner(System.in);
        System.out.println("请选择（1~4）：");
        int num=input.nextInt();
        do {
            switch (num) {
                default:
                    System.out.println("您的输入有误，请重新选择！");
            }
            num=input.nextInt();
        }while (num>4);
        switch (num) {
            case 1:
                System.out.println("看一看，选择心怡的旅行文案吧！");
                break;
            case 2:
                System.out.println("逛一逛，这的装备应有尽有！");
                break;
            case 3:
                System.out.println("写一写，记录旅行的点滴！");
                break;
            case 4:
                System.out.println("聚一聚，点燃青春年少的我们！");
                break;
        }
            System.out.println("欢迎再来，一路有你！");
    }
}
