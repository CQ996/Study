package bao0718;

import java.util.Scanner;

/**
 * @ClassName Average
 * @Description 循环录入5门课成绩并计算平均分
 * @Author CQ
 * @Date 2022/7/18 10:39
 * @Version 1.0
 */
public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = input.next();
        String aswer = "y";
        int zf = 0;
        int i = 0;
        int[] score = new int[5];
        do {
            aswer = "n";
            for (; i < score.length; i++) {
                System.out.println("请输入第" + (i + 1) + "门课的成绩：");
                score[i] = input.nextInt();
                zf += score[i];
                if (score[i] < 0) {
                    aswer = "y";
                    System.out.println("抱歉，分数录入错误，请重新输入！");
                    break;
                }
            }
        } while (aswer.equals("y"));

        System.out.println(name + "的平均分为：" + (zf / 5));


    }
}
