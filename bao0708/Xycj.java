package bao0708;

import java.util.Scanner;

public class Xycj {
    public static void main(String[] args) {
        System.out.println("请输入4位会员卡号：");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        //获取每位数字
        int ge=number%10;
        int shi=number%100/10;
        int bai=number%1000/100;
        int qian=number/1000;
        int he=ge+shi+bai+qian;
        System.out.println("个位："+ge+"  十位："+shi+"  百位："+bai+"  千位："+qian);
        System.out.println("会员卡号各位之和为："+he);
        boolean lucky=he>20;
        System.out.println("是幸运客户吗？："+lucky);

    }
}
