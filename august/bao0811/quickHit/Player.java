package august.bao0811.quickHit;

import java.util.*;

/**
 * @ClassName Player
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/11 14:33
 * @Version 1.0
 */
public class Player {
    Scanner input = new Scanner(System.in);
    public int getLevelNo() {
        return levelNo;
    }

    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }

    public int getCurrScore() {
        return currScore;
    }

    public void setCurrScore(int currScore) {
        this.currScore = currScore;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }



    public Player() {
    }

    public Player(int levelNo, int currScore, long startTime, int elapsedTime) {
        this.levelNo = levelNo;
        this.currScore = currScore;
        this.startTime = startTime;
        this.elapsedTime = elapsedTime;
    }

    public String Playe() {
        String shuru =input.next();
        return shuru;
    }

    //玩家当前关卡
    private int levelNo;
    //玩家当前关卡积分
    private int currScore;
    //当前关卡开始时间
    private long startTime;
    //当前关卡已用时间
    private long elapsedTime;

    public long getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }




}
