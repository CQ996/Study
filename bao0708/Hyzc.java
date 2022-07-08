package bao0708;

import java.util.Scanner;

public class Hyzc {
    public static void main(String[] args) {
        System.out.println("********虾米注册********");
        Scanner input=new Scanner(System.in);
        System.out.println("请输入虾米号（5位数字）：");
        int xmh=input.nextInt();
        if(xmh<=10000||xmh>=99999){
            System.out.println("注册失败，虾米号应为5位数字！");
        }else{
            System.out.println("请输入昵称：");
            String name=input.next();
            System.out.println("请输入生日（月/日）：");
            String birthday=input.next();
            System.out.println("请输入密码：");
            int password=input.nextInt();
            System.out.println("\n");
            System.out.println("您的录入信息：");
            System.out.println("虾米号："+xmh);
            System.out.println("昵称："+name);
            System.out.println("生日："+birthday);
            System.out.println("注册成功，赠送虾币100枚！");
        }

    }
}
