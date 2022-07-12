package bao0711;
/**
 * @ClassName Cxhd
 * @Description 文档描述
 * @Author CQ
 * @Date 2022/7/12 10:28
 * @Version 1.0
 */

import java.util.Scanner;

public class Cxhd {
    public static void main(String[] args) {
        System.out.println("1、标准间（150元/天）2、大床房（220元/天）3、三人间（300元/天）");
        Scanner input = new Scanner(System.in);
        int type1 = 150;
        int type2 = 220;
        int type3 = 300;
        System.out.println("请选择入住房间类型：");
        if (input.hasNextInt()) {
            int type = input.nextInt();
            System.out.println("请选择入住天数：");
            int days = input.nextInt();
            String hd1 = "餐饮9折券";
            String hd2 = "接机服务";
            String hd3 = "升级海景房";
            String hd4 = "房费8折券";
            double money = 0;
            switch (type) {
                case 1:
                    money = type1 * days;
                    break;
                case 2:
                    money = type2 * days;
                    break;
                case 3:
                    money = type3 * days;
                    break;
            }
            System.out.println("酒店入住活动内容如下：");
            System.out.println("1、入住3天（含）以上：加15元换购餐饮9折券");
            System.out.println("2、入住3天（含）以上：加20元接机服务");
            System.out.println("3、入住5天（含）以上：加100元升级海景房");
            System.out.println("4、入住5天（含）以上：加150元换购房费8折券");
            System.out.println("所有客人免费福利，赠送欢迎水果");
            System.out.println("**************************");
            //判断输入信息是否是合法的数字
            System.out.println("请选择：");
            if (days >= 5) {
                int hd = input.nextInt();
                System.out.println("**************************");
                switch (hd) {
                    case 1:
                        System.out.println("本次消费总金额：" + (money + 15));
                        System.out.println("成功换购" + hd1);
                        break;
                    case 2:
                        System.out.println("本次消费总金额：" + (money + 20));
                        System.out.println("成功换购" + hd2);
                        break;
                    case 3:
                        System.out.println("本次消费总金额：" + (money + 100));
                        System.out.println("成功换购" + hd3);
                        break;
                    case 4:
                        System.out.println("本次消费总金额：" + (money + 150));
                        System.out.println("成功换购" + hd4);
                        break;
                }
            } else if (days >= 3) {
                int hd = input.nextInt();
                System.out.println("**************************");
                switch (hd) {
                    case 1:
                        System.out.println("本次消费总金额：" + (money + 15));
                        System.out.println("成功换购" + hd1);
                        break;
                    case 2:
                        System.out.println("本次消费总金额：" + (money + 20));
                        System.out.println("成功换购" + hd2);
                        break;
                }
            } else if (days < 3) {
                System.out.println("本次消费总金额：" + money);
            }
        }
        System.out.println("入住当天将获免费欢迎水果！祝旅途愉快！");
    }

}

