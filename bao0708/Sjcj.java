package bao0708;

import java.util.Scanner;

public class Sjcj {
    public static void main(String[] args) {
        //随机生成0~9数字  10+1就是生成1~11数字
        int random=(int)(Math.random()*10);
        System.out.println("随机幸运数字是："+random);
        System.out.println("请输入4位会员号：");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int bai=number%1000/100;
        boolean xyhy=random==bai;
        System.out.println("是否为幸运会员？"+xyhy);
    }
}
