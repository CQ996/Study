package bao0719;

import java.util.Scanner;

/**
 * @ClassName TeamScore
 * @Description Deom2星际英雄对战赛比分数大小，最大获胜
 * @Author CQ
 * @Date 2022/7/19 14:20
 * @Version 1.0
 */
public class TeamScore {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int []score=new int[3];
        System.out.println("****星际英雄对战赛****");

        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第"+(i+1)+"支战队得分:");
            score[i]=input.nextInt();
        }
        //求最大得分
        int max=0;
        for (int j = 0;j < score.length; j++) {
            if(score[max]<score[j]){
                max=j;
            }

        }
            System.out.println("第一轮获胜队伍为：第"+(max+1)+"队");


    }
}
