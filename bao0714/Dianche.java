package bao0714;

import java.util.Scanner;

public class Dianche {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            System.out.println("请输入第"+i+"班游船人数：");
            if(i==3){
                System.out.println("电力不足，需要充电");
                continue;
            }
            System.out.println("第"+i+"周");
        }

    }
}
