package august.bao0803.carRental;

import java.util.Scanner;

/**
 * @ClassName Test
 * @Description 继承——不同类型汽车租赁计算租金
 * @Author CQ
 * @Date 2022/8/3 22:51
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String type=null;
        double rate=0;
        int seatCount=0;
        int num1;
        System.out.println("请选择你要租赁的车类：（1、轿车  2、客车）");
        num1=in.nextInt();
        switch (num1){
            case 1:
            System.out.println("请选择型号：（1、别克商务舱GL8  2、宝马550i  3、别克林荫大道）");
                int num2=in.nextInt();
                if(num2==1){
                    type="别克商务舱GL8";
                    rate=600;
                }else if(num2==2){
                    type="宝马550i";
                    rate=500;
                }else if(num2==3){
                    type="别克林荫大道";
                rate=300;
                }
                break;
            case 2:
                System.out.println("请选择型号：（1、16座金杯  2、32座金龙）");
                int num3=in.nextInt();
                if(num3==1){
                    type="16座金杯";
                    seatCount=16;
                    if(seatCount<=16){
                        rate=800;
                    }

                }else if(num3==2){
                    type="32座金龙";
                    seatCount=32;
                    if(seatCount>16){
                        rate=1500;
                    }
                }
                break;
        }
        System.out.println("请输入租赁天数：");
        int days=in.nextInt();
        if(num1==1){
            Car car=new Car("皖A88888",type,rate);
            car.setDays(days);
            car.show();
        }else {
            Bus bus=new Bus("皖A66666",type,rate,seatCount);
            bus.setDays(days);
            bus.show();
        }
    }
}
