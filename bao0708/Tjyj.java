package bao0708;

import java.util.Scanner;

public class Tjyj {
    public static void main(String[] args) {
        System.out.println("********去哪游********");
        Scanner input=new Scanner(System.in);
        /*System.out.println("请输入旅行天数：");
        int day=input.nextInt();
        if(day<2){
            System.out.println("探访皇城根，吃遍北京城");
        }else if(day>1&&day<4){
            System.out.println("草原去撒欢，越野深度游");
        }else if (day>3&&day<7) {
            System.out.println("一起去看海，浪漫等你来");
        } else if (day>6) {
            System.out.println("天高任鸟飞，走遍全中国");
        }*/

        System.out.println("请输入旅行月份：");
        int month=input.nextInt();
        //判断输入信息是否是合法的数字
        if (input.hasNextInt()) {
            //char类型需要加单引号，String类需要加双引号;break是结束的意思
            switch (month) {
                case 7:
                    System.out.println("去青岛");
                    break;
                case 8:
                    System.out.println("去西藏");
                    break;
                default:
                    System.out.println("网站推荐");
            }
        }
    }
}
