package bao0721;

/**
 * @ClassName TestTree
 * @Description 树测试
 * @Author CQ
 * @Date 2022/7/21 14:36
 * @Version 1.0
 */
public class TreeTest {
    public static void main(String[] args) {
        Tree tree1=new Tree();
        tree1.diameter=12;
        tree1.height=10;
        tree1.type="猴面包树";
        tree1.water=2000;
        tree1.storesWater();
        tree1.fruit();
        tree1.show();


        System.out.println("\n");
        Tree tree2=new Tree();
        tree2.diameter=120;
        tree2.height=100;
        tree2.type="太古猴面包树";
        tree2.water=9000;
        tree2.storesWater();
        tree2.fruit();
        tree2.show();
        tree2.Spermatogenesis();

    }

}
