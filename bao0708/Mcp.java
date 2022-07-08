package bao0708;

import java.util.Scanner;

public class Mcp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("你买的彩票是否中了500万？");
        String cp=input.next();
        if (cp.equals("是")){
            System.out.println("我买车，资助希望工程，去欧洲旅游");
        }else {
            System.out.println("我买下一期体彩，继续烧高香");
        }
    }
}
