package bao0722;

import java.util.Scanner;

/**
 * @ClassName StudentAchievement
 * @Description 计算学生平均分和总成绩
 * @Author CQ
 * @Date 2022/7/24 13:28
 * @Version 1.0
 */
public class StudentAchievement {
    Scanner input=new Scanner(System.in);
    int java=0;
    int c=0;
    int db=0;
    int sum=0;
    public void show(){
        System.out.print("请输入JAVA成绩：");
        java = input.nextInt();
        System.out.print("\n");
        System.out.print("请输入C#成绩：");
        c = input.nextInt();
        System.out.print("\n");
        System.out.print("请输入DB成绩：");
        db = input.nextInt();
        sum=java+c+db;
        System.out.println("总成绩是："+sum);
        double average=sum/3;
        System.out.println("平均成绩是："+average);
    }

}
