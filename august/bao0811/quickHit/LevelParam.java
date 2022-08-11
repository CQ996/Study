package august.bao0811.quickHit;

/**
 * @ClassName LevelParam
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/11 14:48
 * @Version 1.0
 */
public class LevelParam {
    public static final Level[] leves=new Level[6];
    static {
        leves[0]=new Level(1,2,10,30,1);
        leves[1]=new Level(3,3,9,26,1);
        leves[2]=new Level(3,4,8,22,1);
        leves[3]=new Level(4,5,7,18,1);
        leves[4]=new Level(5,6,6,15,1);
        leves[5]=new Level(6,7,5,12,1);
    }
}
