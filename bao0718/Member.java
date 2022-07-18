package bao0718;

import java.util.Scanner;

/**
 * @ClassName Member
 * @Description TODO
 * @Author CQ
 * @Date 2022/7/18 11:16
 * @Version 1.0
 */
public class Member {
    public static void main(String[] args) {
        System.out.println("MyShopping管理系统>客户信息管理>添加客户信息");
        Scanner input = new Scanner(System.in);
        String answer = "y";
        int j = 1;
        int i = 1;
        for (; i < 4; i++) {
            i = j;
            System.out.println("请输入会员号（<4位整数>）：");
            int hyh = input.nextInt();
            if (hyh > 9999 || hyh < 1000) {
                System.out.println("信息录入失败！");
                continue;
            }
            System.out.println("请输入会员生日（月/日<用2位数表示>）：");
            String birthday = input.next();
            System.out.println("请输入会员积分：");
            int integral = input.nextInt();
            System.out.println("您录入的会员信息是：");
            System.out.println(hyh + "\t" + birthday + "\t" + integral);
            j++;
        }


    }
}
