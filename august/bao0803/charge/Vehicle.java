package august.bao0803.charge;

import java.util.Scanner;

/**
 * @ClassName Vehicle
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/3 14:17
 * @Version 1.0
 */
public class Vehicle {
    Scanner in=new Scanner(System.in);
    public Vehicle(){

    }
    //车长
    protected int length;
    //车牌号
    protected String plateNo;
    //费率
    protected double rate;

    public Vehicle(int length,String plateNo){
        this.length=length;
        this.plateNo=plateNo;
    }

    //里程
    public static final double mileage=100;

    //打印
    public void print(){
        System.out.println("欢迎进入车辆高速公路收费系统");
        System.out.println("请确认车牌号："+plateNo+"（1：是 2：否）");
        int num=in.nextInt();
        if(num==2){
            System.out.println("请重新输入！");
        }else if (num==1){
            System.out.println("***车辆信息***");
            System.out.println("车牌号："+plateNo);
        }

    }

    //收费
    public void getRate(double rate){
        double money=rate*mileage;
        System.out.println("您的车辆需缴费："+money+"元！");
    }

}
