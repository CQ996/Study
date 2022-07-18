package bao0718;

import java.util.Scanner;

/**
 * @ClassName Shopping
 * @Description TODO
 * @Author CQ
 * @Date 2022/7/18 8:47
 * @Version 1.0
 */
public class Shopping {
    public static void main(String[] args) {
        System.out.println("MyShopping管理系统>购物结算");
        System.out.println("******************************************************");
        System.out.println("请选择购买的商品编号：");
        System.out.println("1、T恤\t\t2、网球鞋\t\t3、网球拍");
        System.out.println("******************************************************");
        Scanner input = new Scanner(System.in);


        double money1 = 245.0;
        double money2 = 445.0;
        double money3 = 500.0;

        String answer = "y";
        double money = 0;
        int num = 0;
        int num2 = 0;
        while (answer.equals("y")) {
            System.out.println("请输入商品编号：");
            num = input.nextInt();
            System.out.println("请输入商品数量：");
            num2 = input.nextInt();
            switch (num) {
                case 1:
                    money += money1 * num2;
                    System.out.println("1、T恤\t\t" + money);
                    break;
                case 2:
                    money += money2 * num2;
                    System.out.println("2、网球鞋\t\t" + money2);
                    break;
                case 3:
                    money += money3 * num2;
                    System.out.println("3、网球拍\t\t" + money3);
                    break;
                default:
                    System.out.println("你的输入有误！");

            }
            System.out.println("是否继续（y/n）？");
            answer = input.next();
        }
        double zk = 0.8;
        double yf = money * zk;
        System.out.println("折扣：" + zk);
        System.out.println("应付金额：" + yf + "元");
        System.out.print("实付金额：");
        double sf = input.nextDouble();
        double zl = sf - yf;
        if (zl > 0) {
            System.out.print("找钱：" + zl);
        } else if (zl < 0) {
            System.out.print("您的钱不够支付本次购物！：");
        }


    }
}
