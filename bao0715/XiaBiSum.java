package bao0715;

import java.util.Scanner;

/**
 * @ClassName XiaBiSum
 * @Description 统计本月虾币总数和平均数
 * @Author CQ
 * @Date 2022/7/15 16:33
 * @Version 1.0
 */
public class XiaBiSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*****极火虾1~6月虾币获得记录*****");
        //输入虾币数
        int sum=0;
        int[]xb=new int[6];
        int i = 0;
        for (; i <xb.length; i++) {
            System.out.println("请输入"+(i+1)+"月获得虾币数：");
            System.out.println(i);
            xb[i]= input.nextInt();
            sum +=xb[i];
        }

        System.out.println("1~6月虾币总数为："+sum);
        System.out.println("平均每月虾币数："+sum/i);
    }

}
