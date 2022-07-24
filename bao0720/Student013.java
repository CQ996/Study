package bao0720;

import java.util.Scanner;

/**
 * @ClassName Student
 * @Description 双重循环continue,计算班级平均分和分数大于85的人数
 * @Author CQ
 * @Date 2022/7/20 13:23
 * @Version 1.0
 */
public class Student013 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int []classes=new int[3];
        int []student=new int[4];
        int score=0;
        int eightyfive=0;
        int sum=0;
        double average=0.0;
        for (int i = 0; i < classes.length; i++) {
            System.out.println("*****请输入第"+(i+1)+"个班级的成绩*****");
            sum =0;
            for (int j = 0; j < student.length; j++) {
                System.out.println("请第"+(j+1)+"个学员的成绩");
                score=input.nextInt();
                sum+=score;
                if(score>85){
                    eightyfive++;
                }
                average=(double)sum/student.length;
                continue;
            }
            System.out.println("请输入第"+(i+1)+"个班级的平均分："+average);

        }
        System.out.println("成绩85分以上的学员人数为："+eightyfive);
    }
}
