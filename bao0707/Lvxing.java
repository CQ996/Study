package bao0707;

import java.util.Scanner;

public class Lvxing {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入A团旅行费用：");
        int a=input.nextInt();
        System.out.println("请输入B团旅行费用：");
        int b=input.nextInt();
        boolean dayu=a>b;
        System.out.println("A团费用大于B团吗?"+dayu);
        boolean xiaoyu=a<b;
        System.out.println("A团费用小于B团吗?"+xiaoyu);
        boolean dadeng=a>=b;
        System.out.println("A团费用大于或等于B团吗?"+dadeng);
        boolean xiaodeng=a<=b;
        System.out.println("A团费用小或等于B团吗?"+xiaodeng);
        boolean deng=a==b;
        System.out.println("A团收费与B团收费相同吗?"+deng);
        boolean nodeng=a!=b;
        System.out.println("A团收费与B团收费不同吗?"+nodeng);

    }
}
