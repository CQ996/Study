package bao0722;

import java.util.Scanner;

/**
 * @ClassName AdminTest
 * @Description 管理员类测试
 * @Author CQ
 * @Date 2022/7/22 9:12
 * @Version 1.0
 */
public class AdminTest {
    public static void main(String[] args) {
        Admin admin1=new Admin();
        admin1.name="admin1";
        admin1.password=111111;
        admin1.show();
        //
        Admin admin2=new Admin();
        admin2.name="admin2";
        admin2.password=222222;
        admin2.show();
        //
        Scanner input=new Scanner(System.in);
        String nameinput;
        int passinput;
        String answer="y";
        while (answer.equals("y")){
            System.out.println("请输入用户名：");
            nameinput=input.next();
            System.out.println("请输入密码：");
            passinput=input.nextInt();
            if(nameinput.equals("admin1.name") || nameinput.equals(admin2.name)){
                if(passinput==admin1.password){
                    System.out.println("请输入新密码：");
                    admin1.password=input.nextInt();
                    System.out.println("密码修改成功，您的新密码为："+admin1.password);
                }else if(passinput==admin2.password){
                    System.out.println("请输入新密码：");
                    admin2.password=input.nextInt();
                    System.out.println("密码修改成功，您的新密码为："+admin2.password);
                }
            }else{
                System.out.println("用户名和密码不匹配，你没有权限更改密码！");
            }
        }








    }
}
