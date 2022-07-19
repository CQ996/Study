package bao0719;

import java.util.Scanner;

/**
 * @ClassName StatisticalProportion
 * @Description 统计游戏点击率
 * @Author CQ
 * @Date 2022/7/19 10:23
 * @Version 1.0
 */
public class StatisticalProportion {
    public static void main(String[] args) {
        System.out.println("青鸟游戏平台>游戏点击率");
        Scanner input=new Scanner(System.in);
        int []num=new int[4];
        int num2=0;
        for (int i = 0; i < num.length; i++) {
            System.out.print("请输入第"+(i+1)+"个游戏的点击率:");
            num[i]= input.nextInt();
            if(num[i]>100){
                num2++;
            }
        }
        double proportion=(double)(num2)/(num.length)*100;
        System.out.println("点击率大于100的游戏数量是："+num2);
        System.out.println("点击率大于100的游戏所占的比例为："+proportion+"%");
    }
}
