package bao0718;

import java.util.Scanner;

/**
 * @ClassName TravelPrice
 * @Description 输出最低旅行报价
 * @Author CQ
 * @Date 2022/7/18 16:05
 * @Version 1.0
 */
public class TravelPrice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("*********输出最低的旅行社报价*********");
        int []price=new int[4];
        for (int i = 0; i < price.length ; i++) {
            System.out.println("第"+(i+1)+"旅行社报价(元)");
            price[i]=input.nextInt();
        }
        //求最小值
        int min=price[0];
        for (int i = 0; i < price.length; i++) {
            if(min>price[i]){
                min=price[i];
            }
        }
        System.out.println("最低报价（元）："+min);

    }
}
