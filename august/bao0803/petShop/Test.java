package august.bao0803.petShop;

import java.util.Scanner;

import static august.bao0803.petShop.Penguin.SEX_MALE;
import static august.bao0803.petShop.Penguin.SEX_FEMALE;

/**
 * @ClassName Test
 * @Description 宠物商店——主人给宠物喂食
 * @Author CQ
 * @Date 2022/8/3 19:02
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Master ms = new Master();
        Food food;
        Pets pets;
        String pz = null;
        String sex = null;
        int jkz = 0;
        int intimacy = 0;
        String answer = null;
        System.out.println("欢迎来到宠物店!");
        System.out.println("请输入要领养的宠物的名字：");
        String name = input.next();
        System.out.println("请选择要领养的宠物类型：（1、狗狗 2、企鹅）");
        int sel = input.nextInt();
        //选择宠物种类
        switch (sel) {
            case 1:
                System.out.println("请选择狗狗的品种：（1、聪明的拉布拉多犬 2、酷酷的雪纳瑞）");
                int selt = input.nextInt();
                if (selt == 1) {
                    pz = "聪明的拉布拉多犬";
                } else {
                    pz = "酷酷的雪纳瑞";
                }
                break;
            case 2:
                System.out.println("请选择企鹅的性别：（1、Q仔 2、Q妹）");
                int select = input.nextInt();
                if (select == 1) {
                    sex = SEX_MALE;
                } else {
                    sex = SEX_FEMALE;
                }
                break;
        }
        //选择是否和宠物玩游戏\喂食
        switch (sel) {
            case 1:
                System.out.println("请输入狗狗的健康值：（1~100之间）：");
                System.out.println("健康值应在0~100之间，默认值为60。");
                jkz = input.nextInt();
                System.out.println("要和狗狗玩飞盘游戏吗？(y/n)");
                answer = input.next();
                if (answer.equals("y")) {
                    jkz -= 10;
                    intimacy += 5;
                }
                System.out.println("需要主人喂食吗？(y/n)");
                answer = input.next();
                food=new Bone("骨头");
                pets = new Dog(name, jkz, intimacy, pz);
                if (answer.equals("y")) {
                    ms.feed(pets,food);
                }
                pets.print();
                break;
            case 2:
                System.out.println("请输入企鹅的健康值：（1~100之间）：");
                System.out.println("健康值应在0~100之间，默认值为60。");
                jkz = input.nextInt();
                System.out.println("要和企鹅玩游泳游戏吗？(y/n)");
                answer = input.next();
                if (answer.equals("y")) {
                    jkz -= 10;
                    intimacy += 5;
                }
                pets = new Dog(name, jkz, intimacy, sex);
                System.out.println("需要主人喂食吗？(y/n)");
                answer = input.next();
                food=new Bone("沙丁鱼");
                if (answer.equals("y")) {
                    ms.feed(pets,food);
                }
                break;
        }

    }

}
