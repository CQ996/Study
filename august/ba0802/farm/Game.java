package august.ba0802.farm;

import java.util.Scanner;

import static august.ba0802.farm.Crop.GROW;

/**
 * @ClassName Game
 * @Description 星沐农场——有参、无参构造方法的使用、继承类、私有修饰符
 * @Author CQ
 * @Date 2022/8/1 14:14
 * @Version 1.0
 */
public class Game {
    public static void main(String[] args) {
        AppleTree apple=new AppleTree();
        Corn corn=new Corn();
        String brand;
        double money;
        int zw = 0;
        int selt=0;
        Scanner in=new Scanner(System.in);
        System.out.println("欢迎来到星沐生态农场！");
        boolean quit=false;
        do{
            System.out.println("请选择：1、种植作物2、查看生长状态3、收获果实4、退出");
            switch (in.nextInt()){
                case 1:
                        System.out.println("请选择你要种植的作物：1、苹果树2、玉米");
                            zw=in.nextInt();
                            if(zw==1){
                                selt+=1;
                            }else if(zw==2){
                                selt+=100;
                            }
                        switch (zw){
                            case 1:
                                System.out.println("请选择苹果树的品种：1、富士2、金帅");
                                int a=in.nextInt();
                                if(a==1){
                                    brand="富士";
                                }else {
                                    brand="金帅";
                                }
                                apple.brand=brand;
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
                                corn.money=money;
                                corn.show();
                                break;
                            }
                    break;
                case 2:
                    if(zw==1){
                        System.out.println("*****苹果树查看生长状态*****");
                        apple.state();
                    }else if(selt>100){
                        System.out.println("*****苹果树查看生长状态*****");
                        apple.state();
                        System.out.println("*****玉米查看生长状态*****");
                        corn.state();
                    }else if(zw==2){
                        System.out.println("*****玉米查看生长状态*****");
                        corn.state();
                    }
                    break;
                case 3:
                    if(zw==1){
                        System.out.println("*****苹果树收获果实*****");
                        if(apple.getStatus().equals("采摘期")){
                            System.out.println("恭喜，你收货了"+apple.getNumsFruit()+"颗苹果");
                        }else {
                            System.out.println("抱歉，目前没有果实可以收割！");
                        }
                    }else if(selt>100){
                        System.out.println("*****苹果树收获果实*****");
                        if(apple.getStatus().equals("采摘期")){
                            System.out.println("恭喜，你收货了"+apple.getNumsFruit()+"颗苹果");
                        }else {
                            System.out.println("抱歉，目前没有果实可以收割！");
                        }

                        System.out.println("*****玉米收获果实*****");
                        if(corn.getStatus().equals("采摘期")){
                            System.out.println("恭喜，你收货了"+corn.getNumsFruit()+"颗苹果");
                        }else {
                            System.out.println("抱歉，目前没有果实可以收割！");
                        }
                    }else if(zw==2){
                        System.out.println("*****玉米收获果实*****");
                        if(corn.getStatus().equals("采摘期")){
                            System.out.println("恭喜，你收货了"+corn.getNumsFruit()+"颗苹果");
                        }else {
                            System.out.println("抱歉，目前没有果实可以收割！");
                        }
                    }

                    break;
                case 4:
                    System.out.println("欢迎下次再来！");
                    quit=true;
                    break;
                default:
                    System.out.println("你的输入有误！");
            }

        }while (!quit);


    }
}
