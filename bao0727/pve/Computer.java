package bao0727.pve;

/**
 * @ClassName Computer
 * @Description TODO
 * @Author CQ
 * @Date 2022/7/27 16:57
 * @Version 1.0
 */
public class Computer {
    String name = "AI";//AI名称
    Hero hero;//AI英雄
    int win;//胜出次数


    public void status(){
        System.out.println("\t\t\t"+name+"胜出"+win+"个回合");
    }


}
