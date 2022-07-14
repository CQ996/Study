package ChengqianJishi;

import java.util.Scanner;

/**
 * @ClassName Dome3
 * @Description 如果用户名等于"王老师"，密码等于"123",输出"欢迎您，王老师！"，否则就输出"对不起，您不是王老师！"
 * @Author CQ
 * @Date 2022/7/13 14:02
 * @Version 1.0
 */
public class Dome3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = input.next();
        System.out.println("请输入密码：");
        int password = input.nextInt();

        if (name.equals("王老师") && password == 123) {
            System.out.println("欢迎您，王老师！");
        } else {
            System.out.println("对不起，您不是王老师！");
        }
    }
}
