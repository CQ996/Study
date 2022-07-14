package bao0712;

import java.util.Scanner;

/**
 * @ClassName Mxj
 * @Description 实现冒险家信息登记功能使用for、if、continue
 * @Author CQ
 * @Date 2022/7/12 17:00
 * @Version 1.0
 */
public class Mxj {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要添加的冒险家的数量：");
        int quantity = input.nextInt();
        boolean flag = true;//保存判断结果,赋值为true
        for (int i = 1; i <= quantity; i++) {
            System.out.println("请输入冒险家的编号：");
            int num = input.nextInt();
            System.out.println("请输入冒险家的年龄（岁）：");
            int age = input.nextInt();
            if (age >= 18) {
                flag = false;
            }
            if (flag) {
                System.out.println("这位冒险家的年龄不适合参加沙漠逃亡冒险！");
                System.out.println("录入信息失败！");
            } else {
                System.out.println("请输入冒险家的积分(分)：");
                int integral = input.nextInt();
                System.out.println("你录入的冒险家的信息是：");
                System.out.println("冒险家编号：" + num + "\t冒险家年龄（岁）：" + age + "冒险积分(分)：" + input);
            }
        }
    }
}
