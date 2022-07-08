package bao0708;

import java.util.Scanner;

public class Duochongif {
    //多重if结构
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入摄氏度：");
        int sheshi = input.nextInt();
        if (sheshi < 5) {
            System.out.println("穿羽绒服");
        } else if (sheshi >= 5 && sheshi < 15) {
            System.out.println("穿夹克衫");
        } else if (sheshi >= 15 && sheshi < 25) {
            System.out.println("薄牛仔");
        } else {
            System.out.println("短袖");
        }
    }*/

        //嵌套if结构
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("请输入年龄：");
            int age = input.nextInt();
            if(age>=7&&age<=60){
                System.out.println("是否持证？y/n");
                char result=input.next().charAt(0);
                if(result=='y'){
                    System.out.println("可以深潜");
                }else{
                    System.out.println("可以浮潜");
                }
        }else{
                System.out.println("你的年龄不允许潜水");
             }
        }






}
