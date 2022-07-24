package bao0719;

import java.util.*;

/**
 * @ClassName PickApple
 * @Description 多重循环中使用continue；3位游客每人每天摘随机高度的5个苹果，输出3天后剩余苹果；
 * @Author CQ
 * @Date 2022/7/19 16:51
 * @Version 1.0
 */
public class PickApple {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        for (int i = 1; i <=3 ; i++) {
            System.out.println("******第"+i+"位游客采摘******");
            System.out.println("请输入游客身高：");
            int gao= input.nextInt();
            int height=gao+30;
            int success =0;
            int failure=0;
            for (int j = 1; j <=5 ; j++) {
                //随机生成100~200高度
                int apple=(int)(Math.random()*100+101);
                if(height>=apple){
                    System.out.println(j+"."+"苹果高度："+apple+"摘到啦！");
                    success++;
                    continue;
                }else {
                    System.out.println(j+"."+"苹果高度："+apple+"太高啦，摘不到！");
                    failure++;
                    continue;
                }
            }
            sum +=success;
            System.out.println("第"+i+"位游客摘到苹果"+success+"个");
        }
        System.out.println("************");
        System.out.println("树上还有"+(15-sum)+"个苹果没有采摘");
    }
}
