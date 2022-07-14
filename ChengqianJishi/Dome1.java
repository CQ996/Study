package ChengqianJishi;

import java.util.Scanner;

/**
 * @ClassName Dome1
 * @Description 从控制台输入两个整数数，输出两个数加、减、乘、除、取余的结果。
 * @Author CQ
 * @Date 2022/7/13 13:46
 * @Version 1.0
 */
public class Dome1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入两个数字：");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("加：" + (a + b));
        System.out.println("减：" + (a - b));
        System.out.println("乘：" + (a * b));
        System.out.println("除：" + (a / b));
    }
}
