package bao0711;

import java.util.Scanner;

public class Xmcj {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入小明的考试分数");
        int fraction=input.nextInt();
        if (fraction==100){
            System.out.println("爸爸给买车");
        } else if (fraction<100&&fraction>=90) {
            System.out.println("妈妈给买MP4");
        } else if (fraction<90&&fraction>=60) {
            System.out.println("妈妈给买参考书");
        } else if (fraction<60) {
            System.out.println("什么都不买");
        }
    }
}
