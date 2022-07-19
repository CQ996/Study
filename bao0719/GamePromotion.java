package bao0719;

import java.util.Scanner;

/**
 * @ClassName GamePromotion
 * @Description 玩5局游戏并晋级
 * @Author CQ
 * @Date 2022/7/19 9:07
 * @Version 1.0
 */
public class GamePromotion {
    public static void main(String[] args){
        System.out.println("青鸟游戏平台>游戏晋级");
        Scanner input=new Scanner(System.in);
        String answer="";
        int []result=new int[5];
        int i = 0;
        double num1=0.0;
        do {
            for ( ;; ) {
                System.out.println("你正在玩第"+(i+1)+"局游戏，成绩为：");
                result[i] = input.nextInt();
                if(result[i]>=80){
                    num1++;
                }
                break;
            }
            i++;
            if(i < result.length){
                System.out.println("继续玩下一局吗？（yes/no）");
                answer=input.next();
            }

        }while (answer.equals("y") && i < result.length );
            if(i>= result.length-1){
                System.out.println("游戏结束！");
                if(num1>=4){
                    System.out.println("恭喜！通过一级！");
                }else if(num1>=3){
                    System.out.println("恭喜！通过二级！");
                }
            }else if(i< result.length-1){
                System.out.println("您已经中途退出游戏！您未晋级");
            }



    }
}
