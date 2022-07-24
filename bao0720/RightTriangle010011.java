package bao0720;

import java.util.Scanner;

/**
 * @ClassName RightTriangle
 * @Description 用*打印直角三角形、倒直角三角形
 * @Author CQ
 * @Date 2022/7/20 11:03
 * @Version 1.0
 */
public class RightTriangle010011 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //打印直角三角形
        /*
        System.out.println("请输入直角三角形的行数：");
        int num=input.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j <=(2*i-1) ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        */
        //打印倒直角三角形
        System.out.println("请输入倒直角三角形的行数：");
        int num=input.nextInt();
        for (int i = 0; i <= num; i++) {
            for (int j = num-i; j >=1 ; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
