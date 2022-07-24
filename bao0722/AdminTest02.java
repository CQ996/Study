package bao0722;

import java.util.Scanner;

/**
 * @ClassName AdminTest
 * @Description 管理员类测试第二种写法
 * @Author CQ
 * @Date 2022/7/22 9:12
 * @Version 1.0
 */
public class AdminTest02 {
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
        String []adminname={admin1.name,admin2.name};
        int []adminpass={admin1.password,admin2.password};
        String nameinput;
        int passinput;
        String answer="y";
        while (answer.equals("y")){

                for (int i = 0; i < adminname.length; i++) {
                    System.out.println("请输入用户名：");
                    nameinput=input.next();
                    System.out.println("请输入密码：");
                    passinput=input.nextInt();
                    if(nameinput.equals(adminname[i])){
                        if(passinput==adminpass[i]){
                            System.out.println("请输入新密码：");
                            adminpass[i]=input.nextInt();
                            System.out.println("密码修改成功，您的新密码为："+adminpass[i]);
                        }
                        break;
                    }else{
                        System.out.println("用户名和密码不匹配，你没有权限更改密码！");
                        i=0;
                        continue;
                    }
                }

            }




    }
}
