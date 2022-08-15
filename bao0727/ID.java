package bao0727;

import java.util.Scanner;

/**
 * @ClassName ID
 * @Description 身份证号规定位数，concat拼接字符串
 * @Author CQ
 * @Date 2022/7/27 15:15
 * @Version 1.0
 */
public class ID {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入你的身份证号：");
        String num=input.next();
        if(num.length()==18){
            System.out.println("您登记的身份证号：");
            String a=num.substring(0,6);
            String b=num.substring(14,18);
            String c="********";
            System.out.println(a+"********"+b);
            System.out.println(a.concat(c).concat(b));
        }
    }
}
