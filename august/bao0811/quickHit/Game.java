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
    //关卡字符串的次数
    int a=0;
    int b=0;
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
        a=player.getLevelNo();
        level.setLevelNo(leves[a-1].getLevelNo());
        level.setStrlength(leves[a-1].getStrlength());
        level.setStrTime(leves[a-1].getStrTime());
        level.setTimeLimit(leves[a-1].getTimeLimit());
        level.setPerScore(leves[a-1].getPerScore());

        //输出本关卡的字符串：
        //1、根据当前关卡编号取出关卡相关信息
        //2、产生随机字符串
        //3、打印字符串，并返回

        level.setStrlength(a);
        //1、系统输出一次字符串，返回输出结果
        Random random = new Random();
        //采用字符缓冲区来实现字符串拼接
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < a; i++) {
            int num=random.nextInt(level.getStrlength());
            switch (num){
                case 0:
                    sb.append("q");
                    break;
                case 1:
                    sb.append("w");
                    break;
                case 2:
                    sb.append("a");
                    break;
                case 3:
                    sb.append("s");
                    break;
                case 4:
                    sb.append("d");
                    break;
                case 5:
                    sb.append("e");
                    break;
            }
        }
        String str= sb.toString();
        System.out.println(str);
        ms1= System.currentTimeMillis();
        //2、玩家输入一次字符串，返回输入结果
        player.setStartTime(ms1);
        String shuru=player.Playe();
        printResult(str,shuru);
        return shuru;
    }

    //展示玩家游戏过程
    public void printResult(String out,String in){
        a++;
        //3、确认输入的字符串并输出结果，失败：直接退出！
        if(out.equals(in)){
            ms2= System.currentTimeMillis();
            player.setElapsedTime(ms2);
            int s=(int)(ms2-ms1)/1000;
            int gq= getPlayer().getLevelNo();
            if(s<= level.getTimeLimit()){
                System.out.println("输入正确，您的级别："+player.getLevelNo()+"，您的积分："+player.getCurrScore()+"，已用时："+s+"秒");
                player.setCurrScore(a);
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
