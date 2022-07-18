package ChengqianJishi0713;

import java.util.Scanner;

/**
 * @ClassName Dome4
 * @Description “迅驰”自行车厂商做活动，现场的观众只要体重在130斤以内（包括130斤）
 * 的都可以领取“迅驰”牌山地自行车一辆，否则只能领取本自行车厂家的购车优惠券一张，请用所学知识进行编程。
 * @Author CQ
 * @Date 2022/7/13 14:15
 * @Version 1.0
 */
public class Dome4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的体重（斤）：");
        int weight = input.nextInt();
        if (weight <= 130) {
            System.out.println("恭喜你，您可以领取“迅驰”牌山地自行车一辆！");
        } else {
            System.out.println("恭喜你，您可以领取本自行车厂家的购车优惠券一张！");
        }
    }
}
