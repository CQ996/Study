package bao0708;

import java.util.Scanner;

public class Duochongif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入摄氏度：");
        int sheshi = input.nextInt();
        if (sheshi < 5) {
            System.out.println("穿羽绒服");
        } else if (sheshi >= 5 && sheshi < 15) {
            System.out.println("穿夹克衫");
        } else if (sheshi >= 15 && sheshi < 25) {
            System.out.println("薄牛仔");
        } else {
            System.out.println("短袖");
        }
    }
}
