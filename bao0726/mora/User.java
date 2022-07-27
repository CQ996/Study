package bao0726.mora;

import java.util.Scanner;

/**
 * @ClassName User
 * @Description 猜拳游戏——用户类
 * @Author CQ
 * @Date 2022/7/27 8:31
 * @Version 1.0
 */
public class User {
    Scanner input=new Scanner(System.in);
    int select;
    String mora;
    public  void showFist(){
                System.out.print("请出拳：1、剪刀\t2、石头\t3、布（输入相应数字）：");
                select=input.nextInt();
                switch (select){
                    case 1:
                        mora="剪刀";
                        break;
                    case 2:
                        mora="石头";
                        break;
                    case 3:
                        mora="布";
                        break;
                }
        }

}
