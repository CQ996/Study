package bao0721;

import java.util.Scanner;

/**
 * @ClassName TestPlanet
 * @Description 行星类2，输入行星信息
 * @Author CQ
 * @Date 2022/7/21 15:09
 * @Version 1.0
 */
public class PlanetTest {
    public  void test(){
        Scanner input=new Scanner(System.in);
        String[]planets={"水星","火星","金星","地球","木星","土星","海王星","天王星"};
        String num="";//选择
        String name;//行星名称
        boolean flag=false;//是否是行星
        System.out.println("******太阳系行星*******");
        do {
            Planet planet=new Planet();//创建行星对象
            do{
                System.out.println("请输入行星名称:");
                name=input.next();
                for (int i = 0; i <planets.length; i++) {
                    if(name.equals(planets[i])){
                        flag=true;
                        break;
                    }
                }
                if(flag){
                    break;
                }else {
                    System.out.println("您输入的行星名称有误！");
                }
            }while (true);
            planet.name=name;
            System.out.println("请输入的行星简述：");
            planet.remark=input.next();
            System.out.println("请输入的行星的直径（千米）：");
            planet.diameter=input.nextInt();
            System.out.println("请输入的行星的自转周期：");
            planet.rotationDay=input.nextInt();
            System.out.println("请输入的行星的公转周期：");
            planet.gongzhuan=input.nextInt();
            System.out.println("******"+name+"信息*******");
            planet.show();
            planet.rotation();
            planet.gongZhuans();

        }while (num.equals("y"));
    }
}
