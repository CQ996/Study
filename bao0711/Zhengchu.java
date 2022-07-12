package bao0711;

import java.util.Scanner;

public class Zhengchu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=1;
        int b=0;
        while (a<20) {
            if (a%3==0){
                //b=a+b;
                //b加一个符合条件的a值
                b+=a;
            }
                a++;
        }
        System.out.println(b);
    }
}
