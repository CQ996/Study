package ChengqianJishi;

import java.util.Scanner;

/**
 * @ClassName Dome8
 * @Description TODO
 * @Author CQ
 * @Date 2022/7/13 15:03
 * @Version 1.0
 */
public class Dome8 {
    public static void main(String[] args) {
        System.out.println("欢迎使用MyShopping管理系统");
        System.out.println("*****************************");
        System.out.println("1、客户信息管理");
        System.out.println("2、购物结算");
        System.out.println("3、真情回馈");
        System.out.println("4、注销");
        System.out.println("*****************************");
        Scanner input = new Scanner(System.in);
        System.out.println("请选择，输入数字：");

            do {
                if (input.hasNextInt()) {
                int num = input.nextInt();
                switch (num){
                    case 1:
                        System.out.println("执行客户信息管理\n程序结束！");
                        break;
                    case 2:
                        System.out.println("执行购物结算\n程序结束！");
                        break;
                    case 3:
                        System.out.println("执行真情回馈\n程序结束！");
                        break;
                    case 4:
                        System.out.println("执行注销\n程序结束！");
                        break;
                    default:
                        System.out.println("您的输入有误，请重新输入！");
                }
                /*if (num==1){
                    System.out.println("执行客户信息管理\n程序结束！");
                    break;
                } else if (num==2) {
                    System.out.println("执行购物结算\n程序结束！");
                    break;
                } else if (num==3) {
                    System.out.println("执行真情回馈\n程序结束！");
                    break;
                } else if (num==4) {
                    System.out.println("执行注销\n程序结束！");
                    break;
                } else {
                    System.out.println("您的输入有误，请重新输入！");
                }*/
            }else {
                    String han=input.next();
                    System.out.println("您输入的不是数字，请重新输入！");
                }
            }while(true);


    }
}
