package bao0720;

import java.util.Scanner;

/**
 * @ClassName ShoppingSettlement
 * @Description 购物金额结算
 * @Author CQ
 * @Date 2022/7/20 9:12
 * @Version 1.0
 */
public class ShoppingSettlement003 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入会员本月的消费记录：");
        int []shopping=new int[5];
            for (int i = 0; i < shopping.length; i++) {
                System.out.print("请输入第"+(i+1)+"次购物金额：");
                shopping[i]= input.nextInt();
            }
            System.out.println("序号\t\t\t金额（元）");
        for (int i = 0; i < shopping.length; i++) {
            System.out.println((i+1)+"\t\t\t"+shopping[i]);
        }
    }
}
