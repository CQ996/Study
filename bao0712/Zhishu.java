package bao0712;

import java.util.Scanner;

/**
 * @ClassName Zhishu
 * @Description 控制台输入一个整数，判断是否为质数。
 * @Author CQ
 * @Date 2022/7/12 16:20
 * @Version 1.0
 */
public class Zhishu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = input.nextInt();
        boolean flag = true;//保存判断结果,赋值为true
        //如果能被除1或其本身外的其他数整除，则不为质数
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println(num + "是质数");
        } else {
            System.out.println(num + "不是质数");
        }
    }
}
