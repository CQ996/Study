package bao0718;

import java.util.Scanner;

/**
 * @ClassName Customer
 * @Description 计算顾客年龄层次占比
 * @Author CQ
 * @Date 2022/7/18 9:57
 * @Version 1.0
 */
public class Customer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] age = new int[10];
        int i = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (; i < age.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位顾客的年龄：");
            age[i] = input.nextInt();
            if (age[i] <= 30) {
                sum1 += 1;
            } else if (age[i] > 30) {
                sum2 += 1;
            }
        }
        double bfb1 = (double) sum1 / 10;
        System.out.println("30岁以下的比例是：" + bfb1 * 100 + "%");
        double bfb2 = (double) sum2 / 10;
        System.out.println("30岁以下的比例是：" + bfb2 * 100 + "%");
    }
}
