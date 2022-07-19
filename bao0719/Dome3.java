package bao0719;

import java.util.Scanner;

/**
 * @ClassName Dome3
 * @Description 5轮星际对战赛，输出每队获胜次数
 * @Author CQ
 * @Date 2022/7/19 14:44
 * @Version 1.0
 */
public class Dome3 {
    public static void main(String[] args) {
        int[]scores=new int[3];//保存各组分数
        //保存每轮各组获胜次数
        int[]results=new int[3];//存储最终结果
        Scanner input=new Scanner(System.in);
        //最高成绩
        int max=0;
        for (int i = 0;i < 5; i++) {
            max=0;
            System.out.println("****星际英雄对战赛第"+(i+1)+"轮****");
            for (int j = 0; j < scores.length; j++) {
                System.out.println("请输入第"+(j+1)+"队得分：");
                scores[j]=input.nextInt();
            }
            for (int k = 0; k < scores.length; k++) {
                if(scores[max]<scores[k]){
                    max=k;
                }
            }
            System.out.println("第"+(max+1)+"队获胜！");
            results[max]++;
        }
            for (int i = 0; i < scores.length ; i++) {
                System.out.println("第"+(i+1)+"队共获胜"+results[i]+"次");
            }

    }

}
