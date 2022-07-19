package bao0719;

import java.util.Scanner;

/**
 * @ClassName Pyramid
 * @Description 双循环输出金字塔
 * @Author CQ
 * @Date 2022/7/19 15:37
 * @Version 1.0
 */
public class Pyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j =1; j <=(5-i) ; j++) {
                System.out.print(" ");
            }
            for (int k =1; k <=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
