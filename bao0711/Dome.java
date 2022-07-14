package bao0711;

import java.util.Scanner;

public class Dome {
    public static void main(String[] args) {
        System.out.println("行驶第1公里");
        //重复做的一件事情可以使用循环结构
        int i=1;
        while (i<=100){
            System.out.println("行驶第"+i+"公里");
            i++;//跑完一次加1公里
        }

        /*Scanner input=new Scanner(System.in);
        System.out.println("是否正常营业");
        String answer=input.next();
        while (answer.equals("y")){
            System.out.println("正常营业配餐");
            System.out.println("请问要点菜吗？");
            }
            answer=input.next();
        }
        System.out.println("营业结束");*/
        Scanner input=new Scanner(System.in);
        String answer="input.next()";
        do{
            System.out.println("接餐-送餐");
            System.out.println("是否还有客人等待送餐");
            answer=input.next();
        }while (answer.equals("y"));

        System.out.println("没有客人等待送餐");
    }
}
