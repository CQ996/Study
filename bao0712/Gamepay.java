package bao0712;
import java.util.Scanner;
/**
 * @ClassName Gamepay
 * @Description 实现游戏币支付功能
 * @Author CQ
 * @Date 2022/7/13 9:34
 * @Version 1.0
 */
public class Gamepay {
    public static void main(String[]arge){
        Scanner input=new Scanner(System.in);
        //定义类型
        System.out.println("沙漠逃亡>游戏币支付\n");
        System.out.println("\t1、喝水次数");
        System.out.println("\t2、骆驼体力值");
        int nummax1=0;
        int nummax2=0;
        System.out.println("请选择您要补充的能量类型：");
        int type=input.nextInt();
        switch (type){
            case 1:
                System.out.println("请选择您要补充的数量：");
                    int num1=input.nextInt();
                    nummax1+=num1;
                if(nummax1<10){
                    System.out.println("您补充的是喝水次数："+nummax1+"次,可以享受8折优惠");
                    System.out.println("您需要支付"+(nummax1*3*0.8)+"个游戏币");
                }else {
                    System.out.println("您补充的是喝水次数："+nummax1+"次,可以享受5折优惠");
                    System.out.println("您需要支付"+(nummax1*3*0.5)+"个游戏币");
                }
                break;
            case 2:
                System.out.println("请选择您要补充的数量：");
                int num2=input.nextInt();
                nummax2+=num2;
                if(nummax2<10){
                    System.out.println("您补充的是喝水次数："+nummax2+"次,可以享受8折优惠");
                    System.out.println("您需要支付"+(nummax2*3*0.8)+"个游戏币");
                }else {
                    System.out.println("您补充的是喝水次数："+nummax2+"次,可以享受5折优惠");
                    System.out.println("您需要支付"+(nummax2*3*0.5)+"个游戏币");
                }
        }
    }
}
