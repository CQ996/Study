package bao0711;

import java.util.Scanner;

public class Mc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入你的存款数额，单位（万元）：");
        int ck=input.nextInt();
        if (ck>=500) {
            System.out.println("我要买凯迪拉克");
        } else if (ck>=100&&ck<500) {
            System.out.println("我要买帕萨特");
        } else if (ck>=50&&ck<100) {
            System.out.println("我要买依兰特");
        } else if (ck>=10&&ck<50) {
            System.out.println("我要买奥托");
        } else if (ck<10) {
            System.out.println("我要买捷安特");
        }
    }
}
