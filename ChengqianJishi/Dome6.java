package ChengqianJishi;

import java.util.Scanner;

/**
 * @ClassName Dome6
 * @Description 通过编程简单介绍一下自己的姓名、年龄、爱好
 * @Author CQ
 * @Date 2022/7/13 14:33
 * @Version 1.0
 */
public class Dome6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入我的名字：");
        String name = input.next();
        System.out.println("请输入我的年龄：");
        int age = input.nextInt();
        System.out.println("请输入我的爱好：");
        String hobby = input.next();
        System.out.println("我的名字：" + name);
        System.out.println("我的年龄：" + age);
        System.out.println("我的爱好：" + hobby);
    }
}
