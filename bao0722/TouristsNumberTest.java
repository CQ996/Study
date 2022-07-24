package bao0722;

import java.util.Scanner;

/**
 * @ClassName TouristsNumberTest
 * @Description 客流量测试
 * @Author CQ
 * @Date 2022/7/22 15:40
 * @Version 1.0
 */
public class TouristsNumberTest {
    public static void main(String[] args) {
        TouristsNumber touristsNumber=new TouristsNumber();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入小假期每天的客流量（天）：");
        touristsNumber.day1= input.nextInt();
        touristsNumber.day2= input.nextInt();
        touristsNumber.day3= input.nextInt();
        touristsNumber.show();
    }

}
