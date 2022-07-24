package bao0720;

import java.util.Scanner;

/**
 * @ClassName IsoscelesTriangle012
 * @Description 用*打印等腰三角形
 * @Author CQ
 * @Date 2022/7/20 11:26
 * @Version 1.0
 */
public class IsoscelesTriangle012 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //打印等腰三角形
        System.out.println("请输入等腰三角形的行数：");
        int num=input.nextInt();
        for (int i = 0; i <= num; i++) {
            for (int j = num-i; j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
