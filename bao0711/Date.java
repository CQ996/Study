package bao0711;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入年份（4位数字）：");
        int year=input.nextInt();
        System.out.println("请输入月份：");
        int month=input.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(year+"年"+month+"月有31天！");
                break;
            case 2:
                if (year%4==0 && year%100!=0 || year%400==0) {
                    System.out.println(year+"年"+month+"月有29天！");
                } else {
                    System.out.println(year+"年"+month+"月有28天！");
                }
                break;
            default:
                System.out.println(year+"年"+month+"月有30天！");
        }
    }
}
