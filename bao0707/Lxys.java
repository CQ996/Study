package bao0707;

import java.util.Scanner;

public class Lxys {
    public static void main(String[] args) {
        int sy=3300;
        int hz=2600;
        int sh=3600;
        System.out.println("三亚费用："+sy+"元/人");
        System.out.println("杭州费用："+hz+"元/人");
        System.out.println("上海费用："+sh+"元/人");
        Scanner input=new Scanner(System.in);
                    System.out.print("请输入预算金额：");
                        int ys=input.nextInt();
                    System.out.print("请输入同行人数：");
                        int rs=input.nextInt();
                    System.out.print("请输入折扣：");
                        double zk=input.nextDouble();
        boolean dasy=ys>sy*rs*zk;
        System.out.println("预算足够去三亚吗？"+dasy);
        boolean dahz=ys>hz*rs*zk;
        System.out.println("预算足够去杭州吗？"+dahz);
        boolean dash=ys>sh*rs*zk;
        System.out.println("预算足够去上海吗？"+dash);
    }
}
