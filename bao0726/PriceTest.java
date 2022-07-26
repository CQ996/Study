package bao0726;

import java.util.Scanner;

/**
 * @ClassName PriceTest
 * @Description TODO
 * @Author CQ
 * @Date 2022/7/26 15:20
 * @Version 1.0
 */
public class PriceTest {
    public static void main(String[] args) {
        Price price=new Price();
        Scanner input=new Scanner(System.in);
        double[] moneys=new double[5];
        System.out.println("请输入5件纪念品价格：");
        for (int i = 0; i < moneys.length; i++) {
            double money=input.nextDouble();
            moneys[i]=money;
        }
        double vge=price.getvge(moneys);
        System.out.println("纪念品的平均价格："+vge);
        double max=price.getmax(moneys);
        System.out.println("纪念品的最大价格："+max);
    }

}
