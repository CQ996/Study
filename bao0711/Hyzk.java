package bao0711;

import java.util.Scanner;

public class Hyzk {
    public static void main(String[] args) {
        System.out.println("请输入会员积分：");
        Scanner input=new Scanner(System.in);
        int jf=input.nextInt();
        String text="该会员享受的折扣是：";
        int dis9=9;
        int dis8=8;
        int dis7=7;
        int dis6=6;
        if (jf<2000) {
            System.out.println(text+dis9+"折");
        } else if (jf>=2000&&jf<4000) {
            System.out.println(text+dis8+"折");
        } else if (jf>=4000&&jf<8000) {
            System.out.println(text+dis7+"折");
        } else if (jf>=8000) {
            System.out.println(text+dis6+"折");
        }
    }
}
