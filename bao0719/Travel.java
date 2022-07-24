package bao0719;

import java.util.Scanner;

/**
 * @ClassName Travel
 * @Description 多重循环中使用break；3个月中，每月点赞达到300为人气游记，3篇人气游记每月可获得一枚勋章；统计3个月勋章数量；
 * @Author CQ
 * @Date 2022/7/19 17:21
 * @Version 1.0
 */
public class Travel {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("******人气游记统计******");
        int renqi=0;
        int medal=0;
        //月份
        for (int i = 1; i <=3 ; i++) {
            System.out.println("**"+i+"月**");
            renqi=0;
            for (int j = 1; j <=5 ; j++) {
                System.out.println("请输入第"+j+"篇游记点赞数：");
                int fabulous= input.nextInt();
                if(fabulous>=300){
                    renqi++;
                }
                if(renqi>=3){
                    System.out.println("本月人气游记已达3篇，停止统计！");
                    medal++;
                    break;
                }

            }

        }
        System.out.println("****统计结果****");
        System.out.println("你获得逍遥虾勋章"+medal+"枚");
    }
}
