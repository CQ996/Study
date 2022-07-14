package bao0712;

import java.util.Scanner;

/**
 * @ClassName Huiyuanjifen
 * @Description 旅行平台发放200个会员积分，每个会员发20积分，输出当前积分数以及已领取的会员数。
 * @Author CQ
 * @Date 2022/7/12 15:21
 * @Version 1.0
 */
public class Huiyuanjifen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0, j = 200; j >= 0; i++, j -= 20) {
            System.out.println("当前剩余积分数为：" + j + "已有" + i + "位会员领取积分奖励啦");
        }
        /*
        System.out.println("请输入积分数为：");
        int j=input.nextInt();
        for(int i=0;j>=0;i++){
            System.out.println("当前剩余积分数为："+j+"已有"+i+"位会员领取积分奖励啦");
            j=j-20;

        }*/
    }
}
