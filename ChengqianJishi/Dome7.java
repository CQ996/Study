package ChengqianJishi;

import java.util.Scanner;

/**
 * @ClassName Dome7
 * @Description 根据图片写程序
 * @Author CQ
 * @Date 2022/7/13 14:40
 * @Version 1.0
 */
public class Dome7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入各科成绩：");
        System.out.print("Java成绩：");
        int Java = input.nextInt();
        System.out.print("Html成绩：");
        int Html = input.nextInt();
        System.out.print("C#成绩：");
        int C = input.nextInt();
        System.out.println("\n\n");
        System.out.println("\t\t成绩单");
        System.out.println("科目名称\t\t\t成绩");
        System.out.println("Java\t\t\t" + Java);
        System.out.println("Html\t\t\t" + Html);
        System.out.println("C#\t\t\t\t" + C + "\n");
        double sum = Java + Html + C;
        double average = sum * 1.0 / 3;
        //减去0.05后按照四舍五入的标准输出
        System.out.println(String.format("平均分:" + "%.1f", average - 0.05));

    }
}
