package bao0720;

import java.util.Scanner;

/**
 * @ClassName AinimumPrice008
 * @Description 数组比较输出最低价格
 * @Author CQ
 * @Date 2022/7/20 10:44
 * @Version 1.0
 */
public class AinimumPrice008 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入4家店的价格：");
        int []price=new int[4];
        for (int i = 0; i < price.length; i++) {
            System.out.println("第"+(i+1)+"家店的价格：");
            price[i]=input.nextInt();
        }
        int min=price[0];
        for (int i = 0; i < price.length; i++) {
            if(min>price[i]){
                min=price[i];
            }
        };
        System.out.println("最低价格是："+min);
    }
}
