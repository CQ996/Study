package bao0711;

import java.util.Scanner;

public class Gwjs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入是否是会员，是（y），否（其他字符）：");
        char hy=input.next().charAt(0);
        System.out.println("请输入购物金额：");
        double money=input.nextInt();
        String sjzf="实际支付：";
        if (hy=='y') {
            if (money<200) {
                System.out.println(sjzf+money*0.8);
            } else if (money>=200) {
                System.out.println(sjzf+money*0.75);
            }
        } else if (hy!='y') {
            if (money<100) {
                System.out.println(sjzf+money);
            } else if (money>=100) {
                System.out.println(sjzf+money*0.9);
            }
        }
    }
}
