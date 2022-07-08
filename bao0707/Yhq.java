package bao0707;

import java.util.Scanner;

public class Yhq {
    public static void main(String[] args) {
        System.out.println("*************行程消费单*************");
/*        Scanner input=new Scanner(System.in);
        int jpdj=input.nextInt();
        int jpsl=input.nextInt();
        int jpje=input.nextInt();

        int zsdj=input.nextInt();
        int zssl=input.nextInt();
        int zsje=input.nextInt();

        int mpdj=input.nextInt();
        int mpsl=input.nextInt();
        int mpje=input.nextInt(); */
        int jpdj=788;
        int jpsl=3;
        int jpje=jpdj*jpsl;

        int zsdj=300;
        int zssl=4;
        int zsje=zsdj*zssl;

        int mpdj=550;
        int mpsl=4;
        int mpje=mpdj*mpsl;
        double zk=0.9;
        int zje= (int) ((jpje+mpje+zsje)*zk);
        int yhq= (zje / 3000) * 1;

        System.out.println("机票：北京-三亚\t单价（元/人）："+jpdj+"\t数量："+jpsl+"\t金额（元）："+jpje);
        System.out.println("住宿：红树林酒店\t单价（元/人）："+zsdj+"\t数量："+zssl+"\t金额（元）："+zsje);
        System.out.println("门票：三亚旅游套票\t单价（元/人）："+mpdj+"\t数量："+mpsl+"\t金额（元）："+mpje);

        System.out.println("折扣："+zk*10+"折");
        System.out.println("本次三亚5日游总金额（元）："+zje);
        System.out.println("本次消费获得9折优惠券数量："+yhq);

    }
}
