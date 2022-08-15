package august.ba0802.farm;

import java.util.Scanner;

import static august.ba0802.farm.Crop.GROW;
import static august.ba0802.farm.Crop.MATURE;

/**
 * @ClassName Game
 * @Description 星沐农场——有参、无参构造方法的使用、继承类、多态类，私有修饰符
 * @Author CQ
 * @Date 2022/8/1 14:14
 * @Version 1.0
 */
public class Game {
    static Crop crop=null;
    static  Scanner in=new Scanner(System.in);
    public static Crop getCrop(int type){
        Land land=new Land();
        String brand;
        double money;
        //Crop crop = null;
        switch (type){
            case 1:
                System.out.println("请选择苹果树的品种：1、富士2、金帅");
                int a=in.nextInt();
                if(a==1){
                    brand="富士";
                }else {
                    brand="金帅";
                }
                //向上转型 子--->父
                crop=new AppleTree("苹果树",10,2,100,GROW,true,brand);
                System.out.println("根据市场反馈，果园决定给果树嫁接新品种：");

                AppleTree appleTree=(AppleTree) crop;
                //appleTree.grafting("富士");
                land.pland(crop);
            break;
            case 2:
                System.out.println("请选择收割机类型：1、家用收割机（50元）2、联合收割机（100元）");
                double m=in.nextDouble();
                if(m==1){
                    money=50.0;
                }else {
                    money=100.0;
                }
                crop=new Corn("玉米",8,3,200,GROW,true,money);
                System.out.println("如果玉米大丰收，就需要更换为联合收割机：");
                Corn corn=(Corn) crop;
                land.pland(crop);
            break;
            case 3:
                System.out.println("请选择梨的品种：1、皇冠梨2、香水梨");
                int c=in.nextInt();
                if(c==1){
                    brand="皇冠梨";
                }else {
                    brand="香水梨";
                }
                crop=new Pear("梨树",12,4,120,MATURE,true,brand);
                System.out.println("根据市场反馈，果园决定给果树嫁接新品种：");
                Pear pear =(Pear) crop;
                pear.grafting("砀山梨");
                land.pland(crop);
            break;
            default:
                System.out.println("您的输入有误！");
        }
        return crop;
    }
    public static void main(String[] args) {
        int type = 0;
        System.out.println("欢迎来到星沐生态农场！");
        boolean quit=false;
        do{
            System.out.println("请选择：1、种植作物2、查看生长状态3、收获果实4、退出");
            switch (in.nextInt()){
                case 1:
                        System.out.println("请选择你要种植的作物：1、苹果树 2、玉米 3、梨");
                            type=in.nextInt();
                            crop=getCrop(type);
                            //判断对象A 是否是 B类或B子类创建的对象
                            if(crop instanceof AppleTree){
                                //向下转型 父--->子
                                //父类转换子类对象
                                ((AppleTree)crop).grafting("富士");
                            }else if(crop instanceof Corn){
                                ((Corn)crop).grafting(100);
                            }
                            //crop.show();
                    break;
                case 2:
                    if(type==1){
                        System.out.println("*****苹果树查看生长状态*****");
                        crop.state();
                    }else if(type==2){
                        System.out.println("*****玉米查看生长状态*****");
                        crop.state();
                    }else if(type==3){
                        System.out.println("*****梨树查看生长状态*****");
                        crop.state();
                    }
                    break;
                case 3:
                    if(type==1){
                        System.out.println("*****苹果树收获果实*****");
                        if(crop.getStatus().equals("采摘期")){
                            System.out.println("恭喜，你收货了"+crop.getNumsFruit()+"颗苹果");
                        }else {
                            System.out.println("抱歉，目前没有果实可以收割！");
                        }
                    }else if(type==2){
                        System.out.println("*****玉米收获果实*****");
                        if(crop.getStatus().equals("采摘期")){
                            System.out.println("恭喜，你收货了"+crop.getNumsFruit()+"颗苹果");
                        }else {
                            System.out.println("抱歉，目前没有果实可以收割！");
                        }
                    }else if(type==3){
                        System.out.println("*****梨树收获果实*****");
                        if(crop.getStatus().equals("采摘期")){
                            System.out.println("恭喜，你收货了"+crop.getNumsFruit()+"颗苹果");
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
