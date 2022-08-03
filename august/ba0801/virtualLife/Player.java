package august.ba0801.virtualLife;

import java.util.Scanner;

/**
 * @ClassName Player
 * @Description TODO
 * @Author CQ
 * @Date 2022/7/31 21:00
 * @Version 1.0
 */
public class Player {
    Scanner input=new Scanner(System.in);
    Work work=new Work();
    Shop shop=new Shop();
    Room room=new Room();
    String name;  //昵称
    double money=1000;  //钱数
    int power = 100; //体力值
    int ops;

    //打工
    public void doWork(int choice) {
        work.showSites();
        if(power>=work.power[choice]){
            switch (choice){
                case 1:
                    System.out.println("到"+work.siteList[choice-1]+"打工，工资"+work.moeny[choice-1]
                            +"元，消耗"+work.power[choice-1]+"点体力");
                    double[] m= work.initialSite(choice);
                    money+=m[0];
                    double[] p= work.initialSite(choice);
                    power-=p[1];
                    break;
                case 2:
                    System.out.println("到"+work.siteList[choice-1]+"打工，工资"+work.moeny[choice-1]
                            +"元，消耗"+work.power[choice-1]+"点体力");
                    power-=20;
                    money+=80;
                    break;
                case 3:
                    System.out.println("到"+work.siteList[choice-1]+"打工，工资"+work.moeny[choice-1]
                            +"元，消耗"+work.power[choice-1]+"点体力");
                    power-=35;
                    money+=120;
                    break;
                case 4:
                    System.out.println("到"+work.siteList[choice-1]+"打工，工资"+work.moeny[choice-1]
                            +"元，消耗"+work.power[choice-1]+"点体力");
                    power-=30;
                    money+=110;
                    break;
                case 5:
                    System.out.println("到"+work.siteList[choice-1]+"打工，工资"+work.moeny[choice-1]
                            +"元，消耗"+work.power[choice-1]+"点体力");
                    power-=35;
                    money+=150;
                    break;
                default:
                    System.out.println("没有这个地点！");
            }
        }else {
            System.out.println("你的体力不足，需要休息一下了！");
        }

    }

    //购物
    public void goShopping() {

        shop.showGoods();
        System.out.println("请选择你要购买的商品编号：");
        int choice=input.nextInt();
        ops=1;
        shop.initialGoods(choice);


        if(money>=shop.money[choice]){
            switch (choice){
                case 1:
                    System.out.println("恭喜您购得【"+shop.goodsList[choice-1]+"】一件！");
                    room.addFurniture(shop.goodsList[choice-1]);
                    money-=shop.money[choice-1];
                    break;
                case 2:
                    System.out.println("恭喜您购得【"+shop.goodsList[choice-1]+"】一件！");
                    room.addFurniture(shop.goodsList[choice-1]);
                    money-=shop.money[choice-1];
                    break;
                case 3:
                    System.out.println("恭喜您购得【"+shop.goodsList[choice-1]+"】一件！");
                    room.addFurniture(shop.goodsList[choice-1]);
                    money-=shop.money[choice-1];
                    break;
                case 4:
                    System.out.println("恭喜您购得【"+shop.goodsList[choice-1]+"】一件！");
                    room.addFurniture(shop.goodsList[choice-1]);
                    money-=shop.money[choice-1];
                    break;
                case 5:
                    System.out.println("恭喜您购得【"+shop.goodsList[choice-1]+"】一件！");
                    room.addFurniture(shop.goodsList[choice-1]);
                    money-=shop.money[choice-1];
                    break;
                default:
                    System.out.println("商品不存在，请重新输入！");
            }
        }else {System.out.println("对不起，您的钱不够！");}
    }

    //装修
    public void decorate(){
        if(ops==0){
            System.out.println("你的小窝里还什么都没有哦~");
            System.out.println("到商店看看，为小窝里添置一些家具吧！");
            goShopping();
        }else {
            room.showRoomStatus();
        }
    }

    //恢复体力将用户的体力恢复为满值状态
    public void rest() {
        power=100;
        System.out.println("你美美得睡了一觉~");
        System.out.println("现在你的体力值为："+power);
    }

    //查看状态功能可以查看用户的剩余钱数和体力值
    //查看状态
    public void showStatus(){
        System.out.println("你的钱包里还有"+money+"元钱，体力值剩余："+power);
    }
}
