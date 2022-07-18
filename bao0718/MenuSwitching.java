package bao0718;

import java.util.Scanner;

/**
 * @ClassName MenuSwitching
 * @Description 输入商品和数量，购物结算并找零。
 * @Author CQ
 * @Date 2022/7/18 9:30
 * @Version 1.0
 */
public class MenuSwitching {
    public static void main(String[] args) {
        String num1 = "客户信息管理";
        String num2 = "购物结算";
        String num3 = "真情回馈";
        String num4 = "注销";
        System.out.println("MyShopping管理系统>购物结算");
        System.out.println("******************************************************");
        System.out.println("1、" + num1);
        System.out.println("2、" + num2);
        System.out.println("3、" + num3);
        System.out.println("4、" + num4);
        System.out.println("******************************************************");
        Scanner input = new Scanner(System.in);
        System.out.println("请选择，输入数字：");
        int num = input.nextInt();
        while (num != 1 || num != 2 || num != 3 || num != 4) {
            if (num == 1) {
                System.out.println("执行" + num1);
                break;
            } else if (num == 2) {
                System.out.println("执行" + num2);
                break;
            } else if (num == 3) {
                System.out.println("执行" + num3);
                break;
            } else if (num == 4) {
                System.out.println("执行" + num4);
                break;
            }
            System.out.println("输入错误，请重新输入数字：");
            num = input.nextInt();
        }


    }
}
