package august.bao0811.quickHit;

import java.util.*;
import static august.bao0811.quickHit.LevelParam.leves;

/**
 * @ClassName Game
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/11 14:43
 * @Version 1.0
 */
public class Game {
    Level level=new Level();
    //关卡
    int c;
    //接收当前关卡分数
    int so=0;
    long ms1;
    long ms2;
    public Game() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    private Player player;


    public String printStr(){
        //关卡数
        c= player.getLevelNo();
        //关卡编号
        level.setLevelNo(leves[c-1].getLevelNo());
        //关卡显示的字符串长度
        level.setStrlength(leves[c-1].getStrlength());
        //关卡字符串的次数
        level.setStrTime(leves[c-1].getStrTime());
        //关卡时间限制
        level.setTimeLimit(leves[c-1].getTimeLimit());
        //关卡正确输入一次的得分
        level.setPerScore(leves[c-1].getPerScore());

        for (int i = 0; i < level.getStrTime(); i++) {
            //1、系统输出一次字符串，返回输出结果
            Random random = new Random();
            //采用字符缓冲区来实现字符串拼接
            StringBuffer sb=new StringBuffer();
            for (int j = 0; j < level.getStrlength(); j++) {
                int num=random.nextInt(level.getStrlength());
                switch (num){
                    case 0:
                        sb.append("a");
                        break;
                    case 1:
                        sb.append("b");
                        break;
                    case 2:
                        sb.append("c");
                        break;
                    case 3:
                        sb.append("d");
                        break;
                    case 4:
                        sb.append("e");
                        break;
                    case 5:
                        sb.append("f");
                        break;
                }
            }

            String str= sb.toString();
            //打印输出
            System.out.println(str);
            ms1= System.currentTimeMillis();
            //2、玩家输入一次字符串，返回输入结果
            player.setStartTime(ms1);
            String shuru=player.Playe();
            printResult(str,shuru);

        }
        return "11111";
    }

    //展示玩家游戏过程
    public void printResult(String out,String in){
        c=player.getLevelNo();
        so= player.getCurrScore()+ level.getPerScore();
        //3、确认输入的字符串并输出结果，失败：直接退出！
        if(out.equals(in)){
            ms2= System.currentTimeMillis();
            player.setElapsedTime(ms2);
            int s=(int)(ms2-ms1)/1000;
            int gq= getPlayer().getLevelNo();
            if(s<= level.getTimeLimit()){
                player.setCurrScore(so);
                System.out.println("输入正确，您的级别："+player.getLevelNo()+"，您的积分："+so+"，已用时："+s+"秒");
            }else {
                //4、检查时间：决定是否超时。
                System.out.println("你输入的太慢了，已经超时，退出！");
                System.exit(1);
            }
        }else {
            System.out.println("输入错误，退出！");
            System.exit(1);
        }

    }
}
