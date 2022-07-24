package bao0721;

/**
 * @ClassName TestMonkey
 * @Description 实例化类
 * @Author CQ
 * @Date 2022/7/21 14:11
 * @Version 1.0
 */
public class MonkeyTest {
    public static void main(String[] args) {
        //类名  对象名  创建对象空间
        Monkey monkey=new Monkey();
        monkey.name="乔治";
        monkey.type="狐猴";
        monkey.color="灰色";
        monkey.taillength=20;
        monkey.jump();
        monkey.clmb();
        monkey.show();

        System.out.println("\n");

        Monkey monkey1=new Monkey();//第二只猴子
        monkey1.name="大乔治";
        monkey1.type="狐猴";
        monkey1.color="灰色";
        monkey1.taillength=21;
        monkey1.jump();
        monkey1.clmb();
        monkey1.show();
    }
}
