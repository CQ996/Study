package bao0720;

import java.util.Scanner;

/**
 * @ClassName BuyClothes
 * @Description 双重循环break，5家店每家最多买3件衣服，最终买衣服数量。
 * @Author CQ
 * @Date 2022/7/20 13:49
 * @Version 1.0
 */
public class BuyClothes014 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[]shop=new int[5];
        int[]buy=new int[3];
        int clothes=0;
        String answer="";
        for (int i = 0; i < shop.length ; i++) {
            System.out.println("欢迎光临第"+(i+1)+"家专卖店");
            for (int j = 0; j < buy.length; j++) {
                System.out.println("要离开吗？");
                answer=input.next();
                if(answer.equals("n")){
                    System.out.println("买了一件衣服");
                    clothes++;
                }else {
                    System.out.println("离店结账");
                    break;
                }
            }
        }
        System.out.println("总共买了"+clothes+"件衣服");
    }
}
