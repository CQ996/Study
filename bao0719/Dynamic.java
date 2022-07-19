package bao0719;

import java.util.Scanner;

/**
 * @ClassName Dynamic
 * @Description 输出动态乘法口诀表
 * @Author CQ
 * @Date 2022/7/19 15:52
 * @Version 1.0
 */
public class Dynamic {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入起始值：");
        int start=input.nextInt();
        System.out.println("请输入结束值：");
        int end=input.nextInt();
        for (int i = start; i <=end ; i++) {
            for (int j = start; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println("");
        }

    }
}
