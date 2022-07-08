package bao0707;

import java.util.Scanner;

public class Dzp {
    public static void main(String[] args) {
        System.out.println("****欢迎来到虾神俱乐部——萌虾大转盘****");
        System.out.println("请输入5位数抽奖号码：");
        Scanner input=new Scanner(System.in);
        int shu= input.nextInt();
        //获取每位抽奖数字
        int ge=shu%10;
        int shi=shu%100/10;
        int bai=shu/100%10;
        int qian=shu/1000%10;
        int wan=shu/10000;
        boolean lucky=(ge+shi)==(qian+wan);
        System.out.println("你是欧皇吗？"+lucky);
    }
}
