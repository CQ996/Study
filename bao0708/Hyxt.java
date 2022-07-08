package bao0708;

import java.util.Scanner;

public class Hyxt {
    public static void main(String[] args) {
        System.out.println("我行我素购物管理系统>客户管理系统>添加客户信息");
        Scanner input=new Scanner(System.in);
        System.out.print("请输入会员号（<4位整数>）：");
        int hyh=input.nextInt();
        System.out.print("请输入会员生日（月/日<用两位数表示>）：");
        String birthday=input.next();
        System.out.print("请输入积分：）";
        int integral=input.nextInt();
        System.out.println("已录入的会员信息是：");
        System.out.println(hyh+"  "+birthday+"  "+integral);
    }
}
