package july.jishi0721;

import java.util.Scanner;

/**
 * @ClassName GuessNumber
 * @Description 猜0~99之间的数字，根据猜的次数输出不同结果
 * @Author CQ
 * @Date 2022/7/21 9:16
 * @Version 1.0
 */
public class GuessNumber {
    public static void main(String[] args) {
        int random = (int)(Math.random()*100);
        Scanner input=new Scanner(System.in);
        System.out.println("我心里有一个0~99之间的数，你猜是什么？");
        for (int i = 1; i <99999;i++ ) {
            int number=input.nextInt();
            if(number==random){
                System.out.println("猜对了！");
                if(i==1){
                    System.out.println("你太聪明了！");
                }else if (i>=2&&i<=5){
                    System.out.println("不错，再接再厉！");
                }else if(i>=6){
                    System.out.println("要努力啊！");
                }
            }else if(number>random){
                System.out.println("大了点，再猜！");
            }else if(number<random){
                System.out.println("小了点，再猜！");
            }
        }


    }
}
