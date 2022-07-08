package bao0707;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
            /*Scanner input=new Scanner(System.in);
            System.out.println("请输入旅行预算：");
            int money=input.nextInt();
            System.out.println("请输入体检结果：");
            String name=input.next();
            if((money>=1000&&name.equals("优秀"))||(money>=1200&&name.equals("良好"))){
                System.out.println("可以去旅行");
                }else{
                System.out.println("下次去旅行");
                    }*/
            Scanner input=new Scanner(System.in);
            System.out.println("请问作业做完了吗？y/n：");
            char zy=input.next().charAt(0);
            if (zy=='y'){
            System.out.println("可以去玩游戏");
            }else{
            System.out.println("快去做作业");
            }


            //逻辑运算符：非
            if(!(1>2)){
                System.out.println("大于");
        }

    }
}
