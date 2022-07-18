package bao0712;

import java.util.*;

/**
 * @ClassName Mxlc
 * @Description 设计冒险历程游戏规则
 * @Author CQ
 * @Date 2022/7/12 20:27
 * @Version 1.0
 */
public class Mxlc2 {
    public static void main(String[] args) {
        //已经前进的距离（里程）
        int milesTraveled = 0;
        //口渴程度
        int thirst = 0;
        //喝水的次数
        int drink = 3;
        //骆驼疲惫值
        int camleTiredness = 0;
        //和当地人的距离
        int nativesDistance = (-20);
        //boolean over = true;//保存判断结果,赋值为true
        //口渴值到6 或者 骆驼疲惫值到8 或者 当地人距离值小于或等于0 游戏结束
        //boolean over=(thirsty>=6) || (camel>=8) || (natives<=0);
        System.out.println("选择a，你喝了一口水：");
        System.out.println("选择b，中速前进");
        System.out.println("选择c，全速前进");
        System.out.println("选择d，停下来休息");
        System.out.println("选择e，输出冒险家状态");
        System.out.println("选择q，放弃冒险");
        Scanner input = new Scanner(System.in);
        char userchoice;
        boolean done=false;//游戏结束标识
        while (done==false){
            System.out.println("请输入你的选择：");
            userchoice = input.next().charAt(0);
            switch (userchoice){
                case 'q':
                    done=true;//设置done为true时跳出循环；
                    System.out.println("冒险家放弃抵抗或骆驼被抓，游戏结束了！");
                    break;
                case 'e':
                    System.out.println("已经前进距离为：" + milesTraveled);
                    System.out.println("口渴程度为：" + thirst);
                    System.out.println("你现在喝水次数还有：" + drink+"次");
                    System.out.println("骆驼疲惫值为：" + camleTiredness);
                    System.out.println("和当地人的距离为：" + (milesTraveled-nativesDistance)+"公里");
                    break;
                case 'd':
                        System.out.println("你停下来休息了");
                        camleTiredness = 0;//骆驼疲惫值归零
                        System.out.println("你的骆驼不知道为什么突然就很开心！");
                        nativesDistance += (int)(Math.random()*8)+7;//距离本地人距离随机减少7~15公里
                        System.out.println("和当地人的距离为：" + (milesTraveled-nativesDistance)+"公里");
                    break;
                case 'c':
                    int distance= (int)(Math.random()*11)+10;//全速骑行随机10~20公里
                    System.out.println("全速前进，你骑行了"+distance+"公里");
                    thirst += 1;//口渴+1
                    milesTraveled += distance;//骑行总里程，累加已经骑行的英里数
                    nativesDistance -= (int)(Math.random()*8)+7;//距离本地人距离增加7~15公里
                    camleTiredness += (int)(Math.random()*3)+1;//骆驼疲惫值增加1~4
                    break;
                case 'b':
                    distance= (int)(Math.random()*8)+5;//中速骑行随机5~13公里
                    System.out.println("中速前进，你骑行了"+distance+"公里");
                    thirst += 1;//口渴+1
                    milesTraveled += distance;//骑行总里程，累加已经骑行的英里数
                    nativesDistance -= (int)(Math.random()*8)+7;//距离本地人距离增加7~15公里
                    camleTiredness += 1;//骆驼疲惫值+1
                    break;
                case 'a':
                    if(drink>0){
                        System.out.println("你喝了一口水");
                        thirst = 0;//口渴值归0
                        drink -= 1;//喝水次数-1
                    }else {
                        System.out.println("你没有喝水次数了");
                    }
                    break;
                default:
                    System.out.println("你的输入有误，请重新输入");
                    }
            if (milesTraveled-nativesDistance >= 200) {
                done = true;
                System.out.println("你获得了游戏胜利！");
            }
            if (thirst > 6) {
                done = true;
                System.out.println("你因极度缺水已经昏厥了，游戏结束");
            }else if(thirst>=4 && thirst<6){
                System.out.println("请注意，你已经脱水了");
            }
            if (camleTiredness > 8) {
                done = true;
                System.out.println("你的骆驼因为太过疲惫体力不支，无法继续前进，游戏结束");
            }else if(camleTiredness>=5 && camleTiredness<8){
                System.out.println("请注意，你的骆驼已经乏力了！");
            }

            if (milesTraveled-nativesDistance <= 0) {
                done = true;
                System.out.println("被当地人抓住了，你输了");
            } else if (milesTraveled-nativesDistance <= 15 ) {
                //优化代码，避免用户退出游戏后还在输出
                if(done){
                    break;
                }else {
                    System.out.println("请注意，当地人离你越来越近了");
                }
            }


        }

    }
}

