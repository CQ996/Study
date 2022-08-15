package august.bao0811.quickHit;
/**
 * @ClassName Test
 * @Description 输入字符串闯关游戏
 * @Author CQ
 * @Date 2022/8/11 15:07
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //关卡
        int c=1;
        //玩家
        Player p1 = new Player();
        p1.setLevelNo(1);
        p1.setCurrScore(0);

        //游戏
        Game g1 = new Game();
        g1.setPlayer(p1);

        //开始游戏,循环关卡
        //再循环每个关卡的次数
        for (int i = 0; i < 6; i++) {
            System.out.println("第"+c+"关");
            g1.printStr();
            c++;
            p1.setLevelNo(c);
            p1.setCurrScore(0);
        }
    }
}
