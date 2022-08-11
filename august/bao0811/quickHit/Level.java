package august.bao0811.quickHit;

/**
 * @ClassName Level
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/11 14:40
 * @Version 1.0
 */
public class Level {
    public int getLevelNo() {
        return levelNo;
    }

    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }

    public int getStrlength() {
        return strlength;
    }

    public void setStrlength(int strlength) {
        this.strlength = strlength;
    }

    public int getStrTime() {
        return strTime;
    }

    public void setStrTime(int strTime) {
        this.strTime = strTime;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public int getPerScore() {
        return perScore;
    }

    public void setPerScore(int perScore) {
        this.perScore = perScore;
    }

    public Level() {
    }

    public Level(int levelNo, int strlength, int strTime, int timeLimit, int perScore) {
        this.levelNo = levelNo;
        this.strlength = strlength;
        this.strTime = strTime;
        this.timeLimit = timeLimit;
        this.perScore = perScore;
    }

    //关卡编号
    private int levelNo;
    //关卡显示的字符串长度
    private int strlength;
    //关卡字符串的次数
    private int strTime;
    //关卡时间限制
    private int timeLimit;
    //关卡正确输入一次的得分
    private int perScore;
}
