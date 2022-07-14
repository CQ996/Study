package bao0714;

import java.util.Scanner;

public class Luzhandui {
    public static void main(String[] args) {
        System.out.println("*****第五陆战队夜探敌营*****");
        Scanner input=new Scanner(System.in);
        int sum=0;
        int fulu=0;
        for(int i=1;i<=6;i++){
            System.out.print("第"+i+"名队员前进速度：");
            int a=input.nextInt();
            int atime=200/a;
            if(a>60){
                System.out.println("第"+i+"名队员速度过快，被敌人发现俘虏了");
                fulu++;
                continue;
            }
            System.out.println("第"+i+"名队员前进全程时长："+atime+"分钟");
            sum+=atime;
        }
        System.out.println("全队通过总时长为："+sum+"分钟，被俘虏"+fulu+"人");
    }
}
