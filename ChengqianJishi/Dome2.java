package ChengqianJishi;

import java.util.Scanner;

/**
 * @ClassName Dome2
 * @Description 从控制台输入任意4位整数，输出该数字的各位数字之和。
 * @Author CQ
 * @Date 2022/7/13 13:57
 * @Version 1.0
 */
public class Dome2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个4位数字：");
        int a = input.nextInt();
        int ge = a % 10;
        int shi = a % 100 / 10;
        int bai = a % 1000 / 100;
        int qian = a / 1000;
        int sum = ge + shi + bai + qian;
        System.out.println("这个4位数各位之和为：" + sum);

    }
}