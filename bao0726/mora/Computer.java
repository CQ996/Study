package bao0726.mora;

import java.util.Scanner;

/**
 * @ClassName Computer
 * @Description 猜拳游戏——计算机类
 * @Author CQ
 * @Date 2022/7/27 8:34
 * @Version 1.0
 */
public class Computer {
    Scanner input=new Scanner(System.in);
    String mora;
    int random;
    public  void showFist(){
        random=(int)(Math.random()*3+1);
        switch (random){
            case 1:
                mora="剪刀";
                break;
            case 2:
                mora="石头";
                break;
            case 3:
                mora="布";
                break;
        }

    }


}
