package august.ba0801.farm;

import java.util.Scanner;

/**
 * @ClassName Game
 * @Description 星沐农场——有参、无参构造方法的使用
 * @Author CQ
 * @Date 2022/8/1 14:14
 * @Version 1.0
 */
public class Game {
    public static void main(String[] args) {
        String brand;
        double money;
        Scanner in=new Scanner(System.in);
        System.out.println("欢迎来到星沐生态农场！");
        boolean quit=false;
        do{
            System.out.println("请选择：1、种植作物2、查看生长状态3、收获果实4、退出");
            switch (in.nextInt()){
                case 1:
                        System.out.println("请选择你要种植的作物：1、苹果树2、玉米");
                        switch (in.nextInt()){
                            case 1:
                                System.out.println("请选择苹果树的品种：1、富士2、金帅");
                                int a=in.nextInt();
                                if(a==1){
                                    brand="富士";
                                }else {
                                    brand="金帅";
                                }
                                Apple apple=new Apple(brand);
                                apple.state="生长期";
                                apple.show();
                                break;
                            case 2:
                                System.out.println("请选择收割机类型：1、家用收割机（50元）2、联合收割机（100元）");
                                double m=in.nextDouble();
                                if(m==1){
                                    money=50.0;
                                }else {
                                    money=100.0;
                                }
                                Corn corn=new Corn(money);
                                corn.state="生长期";
                                corn.show();
                                break;
                            }
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("收获果实");
                    break;
                case 4:
                    System.out.println("还有下次再来！");
                    quit=true;
                    break;
            }

        }while (!quit);


    }
}
