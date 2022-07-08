package bao0708;

import java.util.Scanner;

public class Dzp02 {
        public static void main(String[] args) {
            System.out.println("****欢迎来到虾神俱乐部——萌虾大转盘****");
            System.out.println("请输入5位数抽奖号码：");
            Scanner input=new Scanner(System.in);
            int shu= input.nextInt();
            //获取每位抽奖数字
            int ge=shu%10;
            int shi=shu%100/10;
            int bai=shu/100%10;
            int qian=shu/1000%10;
            int wan=shu/10000;
            //随机生成1~5位数字
            int random=(int)(Math.random()*5+1);
            System.out.println("随机幸运数字是："+random);
            if((ge+shi)==(qian+wan)){
                if(shu%random==0){
                    System.out.println("您是今天的幸运虾！");
                    System.out.println("获得精品线路免单卡1张！");
                }else if(shu%random!=0){
                    System.out.println("您是今天的幸运虾！");
                    System.out.println("获得优惠券1张！！");
                }
            }else{
                    System.out.println("很抱歉，您不是今天的幸运虾！");
                }

        }

}

