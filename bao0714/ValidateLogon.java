package bao0714;

import java.util.Scanner;

public class ValidateLogon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*****登录自由虾*****");
        for(int i=1;i<10;i++){
            if(i>3){
                System.out.print("对不起，3次输入错误，系统将锁定5分钟！");
                break;
            }
            System.out.print("请输入昵称");
            String name=input.next();
            System.out.print("请输入密码");
            int pass=input.nextInt();
            if(!(name.equals("程前")) || pass!=666666){
                System.out.println("您的输入有误！");
                continue;
            }
            if(name.equals("程前") && pass==666666){
                System.out.print("欢迎来到极火虾，快来一次说走就走的旅行吧！");
                break;
            }
        }

    }
}
