package bao0728.tickets;

import java.util.Scanner;

/**
 * @ClassName Flights
 * @Description 飞机航班价格表，用StringBuffer插入逗号
 * @Author CQ
 * @Date 2022/7/28 14:19
 * @Version 1.0
 */
public class Flights {
    Scanner input=new Scanner(System.in);
    String[] flightNums={"SC4560","SC4561","SC4562","SC4563","SC4564","SC4565"};
    String[] ftimes={"6:00","7:00","7:30","10:00","8:00","18:00"};
    String[] dtimes={"10:00","10：10","10：30","12：20","13：50","20:00"};
    double[] prices={520.8,1111.8,1522.5,3700.7,1450.6,2210.5};
    String[] pricesss={"1","1","1","1","1","1"};
    double price;
    String names="dd";
    int pwds=123456;
    public void login(){
        System.out.println("请输入用户名：");
        String name=input.next();
        System.out.println("请输入密码：");
        int pwd=input.nextInt();
        if(name.equals(names) && pwd==pwds){
            System.out.println("登录成功！");
            showFlight();
        }else {
            System.out.println("用户名或密码错误");
        }
    }
    public void showFlight(){
        System.out.println("*******机票预定*******");
        System.out.println("航班号\t\t起飞时间\t\t到达时间\t\t机票价格");
        for (int i = 0; i < flightNums.length; i++) {
            String money=fmtPrince(prices[i]);
            System.out.println(flightNums[i]+"\t\t"+ftimes[i]+"\t\t"+dtimes[i]+"\t\t"+money);
        }
    }
    public String fmtPrince(double dj) {
        StringBuffer sb = new StringBuffer(String.valueOf(dj));
        //从小数点每左三位加逗号
        for (int i = sb.indexOf(".") - 3; i > 0; i -= 3) {
            sb.insert(i, ",");
        }
        return sb.toString();
    }
    public void buy(){
        System.out.println("请输入你要购买的航班号：");
        String hbh=input.next();
        System.out.println("请输入你要购买机票数量：");
        int num=input.nextInt();
        for (int i = 0; i < prices.length; i++) {
            if(hbh.equals(flightNums[i])){
                double sumMoney=prices[i]*num;
                String payMoney=fmtPrince(sumMoney);
                System.out.println("您需要支付"+payMoney+"元");
            }
        }
    }
}
