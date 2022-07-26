package bao0725;

import java.util.Scanner;

/**
 * @ClassName GameTest
 * @Description （对战游戏）显示 AI VS 真人 游戏
 * @Author CQ
 * @Date 2022/7/25 14:12
 * @Version 1.0
 */
public class GameTest {
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            Player player=new Player();
            Computer computer=new Computer();

    //是否下一局
    String answer="";
    //累计局数：
    int num=0;
    //英雄获胜回合数：
    int win1 = 0;
    //Ai获胜回合数：
    int win2 = 0;
            for (int i = 1; i < 4; i++) {
                System.out.println("-----------第【"+i+"】回合-----------");
                //调用真人类里的返回值(Ai剩余血量)，同时会运行一遍
                int hp2=player.people();
                //调用Ai类里的返回值(真人剩余血量)
                int hp1=computer.ai();
                System.out.println("真人剩余血量："+hp1);
                System.out.println("AI剩余血量："+hp2);
                if(hp1>hp2){
                    System.out.println("第"+i+"回合,英雄获胜");
                    win1++;
                }else if(hp1<hp2){
                    System.out.println("第"+i+"回合,AI获胜");
                    win2++;
                }else if(hp1==hp2){
                    System.out.println("第"+i+"回合,英雄和AI平局");
                }
                System.out.println("*******************************");
                System.out.println("请选择是否开始下一局（y/n）：");
                answer=input.next();
                if (answer.equals("n")){
                    num++;
                    break;
                }else {
                    num++;
                }
            }
                System.out.println("\t共进行"+num+"局游戏");
                System.out.println("真人获胜回合数："+win1);
                System.out.println("AI获胜回合数：\t"+win2);
                if(win1>win2){
                    System.out.println("\t结果:真人胜出");
                }else if(win1<win2){
                    System.out.println("\t结果:AI胜出");
                }else {
                    System.out.println("\t结果:这局是平局");
                }
                System.out.println("*******************************");
    }
}
