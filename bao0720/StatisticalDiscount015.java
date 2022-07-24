package bao0720;

import java.util.Scanner;

/**
 * @ClassName StatisticalDiscount015
 * @Description 双重循环continue,统计享受优惠商品的数量
 * @Author CQ
 * @Date 2022/7/20 14:02
 * @Version 1.0
 */
public class StatisticalDiscount015 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int []people=new int[3];
        //商品
        int []commodity=new int[3];
        double []price=new double[3];
        int discount =0;
        for (int i = 0; i < people.length; i++) {
            discount=0;
            System.out.println("请输入第"+(i+1)+"个人所购买的商品价格：");
            for (int j = 0; j < commodity.length; j++) {
                price[j]=input.nextDouble();
                if(price[j]>300){
                    discount++;
                }
            }
            System.out.println("请输入第"+(i+1)+"个人共有"+discount+"件商品享受8折优惠！");
        }
    }
}
