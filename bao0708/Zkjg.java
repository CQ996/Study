package bao0708;

import java.util.Scanner;

public class Zkjg {
    public static void main(String[] args) {
        System.out.println("请输入折扣：");
        Scanner input=new Scanner(System.in);
        double zk=input.nextDouble();
        int tx=120;
        int wqx=400;
        int wqp=230;
        boolean ztx=(tx*zk)<100;
        System.out.println("T恤价格低于100吗："+ztx);
        boolean zwqx=(wqx*zk)<100;
        System.out.println("网球鞋价格低于100吗："+zwqx);
        boolean zwqp=(wqp*zk)<100;
        System.out.println("网球拍价格低于100吗："+zwqp);
    }
}
