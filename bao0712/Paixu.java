package bao0712;

import java.util.Scanner;

/**
 * @ClassName Paixu
 * @Description 输入数字从小到大排序
 * @Author CQ
 * @Date 2022/7/12 14:10
 * @Version 1.0
 */
public class Paixu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.println("请输入三个数字：");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        System.out.println("从小到大排序：" + a + "\t" + b + "\t" + c);*/
        System.out.println("请输入你左手的扑克牌数字：");
        int left = input.nextInt();
        System.out.println("请输入你右手的扑克牌数字：");
        int right = input.nextInt();
        if (left > right) {
            int shou = left;
            left = right;
            right = shou;
        }
        System.out.println("你左手的扑克牌数字：" + left + "输入你右手的扑克牌数字：" + right);
        System.out.println("哇！你是赌神？？？！！！");
    }
}
