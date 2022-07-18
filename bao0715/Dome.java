package bao0715;

import java.util.Scanner;

/**
 * @ClassName Dome
 * @Description 数组
 * @Author CQ
 * @Date 2022/7/15 15:57
 * @Version 1.0
 */
public class Dome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //可以存放6个蛋糕
        String[]names=new String[6];
        /*names[0]="冰淇淋蛋糕";

        String[]names1;
        names1=new String[6];
        names1[0]="草莓蛋糕";

        String[]names2={"a","b","c"}*/

        //循环输入蛋糕名称
        for (int i = 0; i <names.length; i++) {
            System.out.println("请输入第"+(i+1)+"蛋糕名称：");
            names[i]=input.next();
        }
        //打印蛋糕名称
        System.out.println("打印蛋糕名称");
        for (int i = 0; i <names.length; i++) {
            System.out.println(names[i]+"\t");
        }
        //打印第4个蛋糕名称
        System.out.println(names[3]+"\t");

        //打印第2到第4个蛋糕
        System.out.println("打印2~4号蛋糕名称");
        for (int i = 1; i <names.length-2; i++) {
            System.out.println(names[i] + "\t");
        }
    }
}
