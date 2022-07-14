package bao0714;

import java.util.Scanner;

public class Oxhx {
    public static void main(String[] args) {
        System.out.println("*****偶像天团海选*****");
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.println("请输入第" + i + "名选手得分为：");
            int score = input.nextInt();
            System.out.println("请输入第" + i + "名选手已入局：");
            if (score > 60 && score < 80) {
                System.out.println("该选手被淘汰！");
                continue;
            }
            if (score <= 60) {
                System.out.println("该组合被淘汰！");
                break;
            }
            sum += score;
        }
        System.out.print("该组合总分为：" + sum);
    }
}
