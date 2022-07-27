package bao0726.mora;

/**
 * @ClassName MoraTest
 * @Description 猜拳游戏——测试运行
 * @Author CQ
 * @Date 2022/7/27 10:19
 * @Version 1.0
 */
public class MoraTest {
    public static void main(String[] args) {
        User user=new User();
        Computer computer=new Computer();
        Game game=new Game();
        game.initial();
        game.startGame();
        game.showResult();
    }
}
