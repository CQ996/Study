package bao0706;

import java.util.Scanner;

public class Kongzhitai {
    public static void main(String[] args) {
        //从控制台输入两个数
        Scanner input=new Scanner(System.in);
        System.out.print("请输入第一个数");
        int num1= input.nextInt();
        System.out.print("请输入第二个数");
        int num2= input.nextInt();
        //求和
        int qiuhe=num1+num2;
        System.out.println("两数之和："+qiuhe);
        //求差
        int cha=num1-num2;
        System.out.println("两数之差："+cha);
        //求商
        int shang=num1/num2;
        System.out.println("两数之商："+shang);
        //求积
        int ji=num1*num2;
        System.out.println("两数之积："+ji);
    }
}
