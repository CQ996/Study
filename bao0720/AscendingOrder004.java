package bao0720;

import java.util.Scanner;
import java.util.Arrays;
/**
 * @ClassName AscendingOrder
 * @Description 学员成绩数组升序排列
 * @Author CQ
 * @Date 2022/7/20 9:29
 * @Version 1.0
 */
public class AscendingOrder004 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入5位学员成绩：");
        int []achievement=new int[5];
        for (int i = 0; i < achievement.length; i++) {
            achievement[i]=input.nextInt();
        }
        Arrays.sort(achievement);
        System.out.print("学员成绩升序排列：");
        for (int i = 0; i < achievement.length; i++) {
            System.out.print(achievement[i]+"\t");
        }
    }

}
