package bao0712;

import java.util.Scanner;
import java.util.Random;

/**
 * @ClassName Cybl
 * @Description 实现穿越部落的功能
 * @Author CQ
 * @Date 2022/7/13 8:36
 * @Version 1.0
 */
public class Cybl {
    public static void main(String[] args) {
        System.out.println("沙漠逃亡>穿越部落\n");
        Scanner input = new Scanner(System.in);
        int tribe = 1;//定义部落
        //部落间随机距离100~400
        int max = 400;
        int min = 100;
        int mileage = 0;
        Random random = new Random();
        int juli = 0;
        do {
            if (tribe <= 5) {
                System.out.println("你正在逃亡到第" + tribe + "个部落");
                System.out.println("请决定：a、继续逃生 b、向当地人交出骆驼");
                char choice = input.next().charAt(0);
                if (choice == 'a') {
                    //部落间随机距离100~400
                    mileage = random.nextInt(max) % (max - min + 1) + min;
                    System.out.println("开始逃亡，前进距离为：" + mileage);
                    juli = juli + mileage;
                } else if (choice == 'b') {
                    System.out.println("你向当地人交出了骆驼，游戏结束");
                }
                tribe++;
            } else {
                System.out.println("你穿越了5个部落，获得了游戏胜利！");
                break;
            }
        } while (juli < 1000);
        if (tribe == 1) {
            System.out.println("你前进了" + juli + "公里");
            System.out.println("恭喜，你获得了冒险新手称号！");
        } else if (tribe == 2) {
            System.out.println("你前进了" + juli + "公里");
            System.out.println("恭喜，你获得了冒险熟手称号！");
        } else if (tribe == 3) {
            System.out.println("你前进了" + juli + "公里");
            System.out.println("恭喜，你获得了冒险家称号！");
        } else if (tribe == 4) {
            System.out.println("你前进了" + juli + "公里");
            System.out.println("恭喜，你获得了老练冒险家称号！");
        } else if (tribe == 5) {
            System.out.println("你前进了" + juli + "公里");
            System.out.println("恭喜，你获得了冒险王称号！");
        }
    }
}
