package bao0719;

import java.util.Scanner;

/**
 * @ClassName AddInformation
 * @Description 添加用户信息，以年龄判断输入是否合法
 * @Author CQ
 * @Date 2022/7/19 10:46
 * @Version 1.0
 */
public class AddInformation {
    public static void main(String[] args) {
        System.out.println("青鸟游戏平台>添加用户信息");
        Scanner input = new Scanner(System.in);
        String answer = "y";
        int j = 1;
        int i = 1;
        System.out.println("请输入要录入用户的数量：");
        int num=input.nextInt();
        for (; i <= num; i++) {
            i = j;
            System.out.println("请输入用户编号（<4位整数>）：");
            int usernumber = input.nextInt();
            System.out.println("请输入用户年龄：");
            int age = input.nextInt();
            if (age<10) {
                System.out.println("很抱歉，您的年龄不适宜玩游戏。");
                System.out.println("信息录入失败！");
                continue;
            }
            System.out.println("请输入会员积分：");
            int integral = input.nextInt();
            System.out.println("您录入的会员信息是：");
            System.out.println(usernumber + "\t" + age + "\t" + integral);
            j++;
        }
    }
}
