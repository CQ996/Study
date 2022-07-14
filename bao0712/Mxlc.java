package bao0712;

import java.util.Scanner;

/**
 * @ClassName Mxlc
 * @Description 设计冒险历程游戏规则
 * @Author CQ
 * @Date 2022/7/12 20:27
 * @Version 1.0
 */
public class Mxlc {
    public static void main(String[] args) {
        //已经前进的距离（里程）
        int mileage = 0;
        //口渴程度
        int thirsty = 0;
        //喝水的次数
        int drink = 3;
        //骆驼疲惫值
        int camel = 0;
        //和当地人的距离
        int local = (-20);
        //boolean over = true;//保存判断结果,赋值为true
        //口渴值到6 或者 骆驼疲惫值到8 或者 当地人距离值小于或等于0 游戏结束
        //boolean over=(thirsty>=6) || (camel>=8) || (local<=0);
        System.out.println("选择a，你喝了一口水：");
        System.out.println("选择b，中速前进");
        System.out.println("选择c，全速前进");
        System.out.println("选择d，停下来休息");
        System.out.println("选择e，输出冒险家状态");
        System.out.println("选择q，放弃冒险");
        Scanner input = new Scanner(System.in);
        String answer = "";
        char choice;
        do {
            System.out.println("请输入你的选择：");
            choice = input.next().charAt(0);
            switch (choice) {
                //a 进行喝水动作
                case 'a':
                    System.out.println("你喝了一口水");
                    thirsty -= 1;//口渴-1
                    drink += 1;//喝水次数+1
                    break;
                case 'b':
                    System.out.println("中速前进，你骑行了5公里");
                    thirsty += 1;//口渴+1
                    mileage += 5;//总里程+5
                    local += 5;//距离本地人距离+5
                    camel += 1;//骆驼疲惫值+1
                    break;
                case 'c':
                    System.out.println("全速前进，你骑行了16公里");
                    thirsty += 1;//口渴+1
                    mileage += 16;//总里程+16
                    local += 16;//距离本地人距离+16
                    camel += 2;//骆驼疲惫值+2
                    break;
                case 'd':
                    if (local < 15) {
                        System.out.println("你停下来休息了");
                        System.out.println("注意，当地人已经离你越来越近了！");
                        camel -= 20;//骆驼疲惫值-20
                        local -= 5;//距离本地人距离-5
                    } else {
                        System.out.println("你停下来休息,当地人离你还很远");
                    }
                    break;
                case 'e':
                    System.out.println("已经前进距离为：" + mileage +
                            "\t口渴程度为：" + thirsty + "\t你现在喝水次数为：" +
                            drink + "\t骆驼疲惫值为：" + camel + "\t和当地人的距离为：" + local);
                    break;
                case 'q':
                    System.out.println("你结束了冒险！");
            }
        } while (local < 200 && choice != 'q');
        if (local < 15) {
            System.out.println("被当地人抓住了，你输了");
        } else if (local >= 15 && local < 200) {
            if (thirsty <= 6 && camel <= 8) {
                System.out.println("你没有被当地人抓住");
                System.out.println("并且口渴不大于6，骆驼疲惫值不大于8，这局游戏平局");
            } else if (thirsty > 6) {
                System.out.println("你没有被当地人抓住");
                System.out.println("但是口渴大于6，你还是输了");
            } else if (camel > 8) {
                System.out.println("你没有被当地人抓住");
                System.out.println("但是骆驼疲惫值大于8，你还是输了");
            }
        } else if (local >= 200) {
            System.out.println("你获得了游戏胜利！");
        }
    }
}

