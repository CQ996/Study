package bao0712;

import java.util.Scanner;

/**
 * @ClassName Dome
 * @Description for循环
 * @Author CQ
 * @Date 2022/7/12 15:05
 * @Version 1.0
 */
public class Dome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int a = 1; a <= 6; a++) {
            System.out.println("请输入第" + a + "月的奖品预算：");
            int money = input.nextInt();
            sum += money;//sum=sum+money
        }
        System.out.println("总预算金额为：" + sum);
    }
}
