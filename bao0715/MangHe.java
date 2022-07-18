package bao0715;

import java.util.Scanner;

/**
 * @ClassName MangHe
 * @Description 盲盒抽奖
 * @Author CQ
 * @Date 2022/7/15 17:18
 * @Version 1.0
 */
public class MangHe {
    public static void main(String[] args) {
        System.out.println("*****快来抽个盲盒试试运气吧*****");
        Scanner input = new Scanner(System.in);
        String answer="y";
        //输入盲盒礼物
        String[]gift=new String[5];
        for (int i = 0; i < gift.length; i++) {
            System.out.println("请向第"+(i+1)+"个盲盒装入礼物：");
            gift[i]= input.next();
        }
        while (answer.equals("y")){
            System.out.println("是否抽取盲盒？");
            answer=input.next();
            if(answer.equals("n")){
                System.out.println("游戏结束！");
            }else {
                int random=(int)(Math.random()*5);
                System.out.println("您抽到的是："+gift[random]);
            }

        }

    }
}
