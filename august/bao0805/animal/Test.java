package august.bao0805.animal;

import java.util.Scanner;

/**
 * @ClassName Test
 * @Description 根据选择获赠宠物，宠物会发出对应的叫声
 * @Author CQ
 * @Date 2022/8/7 12:47
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Animal animal;
        Host host=new Host();
        System.out.println("你想要哪种宠物？（1、小狗 2、小猫 3、小鸭子）");
        int type=in.nextInt();
        switch (type){
            case 1:
                animal=new Dog("小狗","汪汪");
                host.donate(animal);
                break;
            case 2:
                animal=new Dog("小猫","喵喵");
                host.donate(animal);
                break;
            case 3:
                animal=new Dog("小鸭子","嘎嘎");
                host.donate(animal);
                break;
        }

    }
}
