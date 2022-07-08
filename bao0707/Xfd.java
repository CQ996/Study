package bao0707;

import java.util.Scanner;

public class Xfd {
    public static void main(String[] args){

        String gmwp1="T恤";
        String gmwp2="网球鞋";
        String gmwp3="网球拍";
         //T恤个数
        Scanner input=new Scanner(System.in);
        System.out.println("T恤个数");
        int txgs=input.nextInt();
        //T恤金额

        System.out.println("T恤单价");
        int txdj=input.nextInt();
        int tx=txdj*txgs;

        //网球鞋个数

        System.out.println("网球鞋个数");
        int wqxgs=input.nextInt();
        //网球鞋金额
        System.out.println("网球鞋单价");
        int wqxdj=input.nextInt();
        int wqx=wqxdj*wqxgs;

        //网球拍个数
        System.out.println("网球拍个数");
        int wqpgs=input.nextInt();
        //网球拍金额
        System.out.println("网球拍单价");
        int wqpdj=input.nextInt();
        int wqp=wqpdj*wqpgs;

        //未折扣消费总金额
        double zje=tx+wqx+wqp;



        //折扣
        System.out.println("请输入折扣");
        double zk=input.nextDouble();
        //折扣总金额
        double zkzje=zje*zk;


        //实际交费
        System.out.println("实际交费");
        int sjjf=input.nextInt();

        double zq= sjjf-zkzje;

        System.out.println("********消费单********");
        System.out.println("购买物品\t\t单价\t\t个数\t\t金额");
        System.out.println(gmwp1+"\t\t\t"+txdj+"\t\t"+txgs+"\t\t"+tx);
        System.out.println(gmwp2+"\t\t"+wqxdj+"\t\t"+wqxgs+"\t\t"+wqx);
        System.out.println(gmwp3+"\t\t"+wqpdj+"\t\t"+wqpgs+"\t\t"+wqp+"\n\n");

        System.out.println("折扣：\t\t"+zk*10+"折");
        System.out.println("消费总金额\t￥"+zkzje);
        System.out.println("实际交费\t\t￥"+sjjf);
        System.out.println("找钱\t\t\t￥"+zq);
        System.out.println("本次购物所获的积分是：33");
    }
}
