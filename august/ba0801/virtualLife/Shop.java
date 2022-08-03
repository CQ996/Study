package august.ba0801.virtualLife;

import java.util.Scanner;

/**
 * @ClassName Shop
 * @Description TODO
 * @Author CQ
 * @Date 2022/7/31 21:03
 * @Version 1.0
 */
public class Shop {
    Scanner input=new Scanner(System.in);
    String[] goodsList={"床", "桌子", "椅子", "衣柜", "沙发"};//商品列表
    double[] money={500.0,300.0,100.0,200.0,200.0};
    public void showGoods() {
        System.out.println("*********商品列表*********");
        for (int i = 0; i < goodsList.length; i++) {
            System.out.println((i+1)+".名称："+goodsList[i]+"价格（元）："+money[i]);
        }
    }
    public double initialGoods(int goodsNum) {
        int index = goodsNum - 1;
        double price = 0;
        switch (index) {
            case 0:
                price = 500.0;
                break;
            case 1:
                price = 300.0;
                break;
            case 2:
                price = 100.0;
                break;
            case 3:
                price = 200.0;
                break;
            case 4:
                price = 200.0;
                break;
        }
        return price;
    }

}
