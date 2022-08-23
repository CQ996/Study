package august.bao0824.thread_communication;

/**
 * @ClassName DrawThread
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/23 17:43
 * @Version 1.0
 */
public class DrawThread extends Thread {
    private Account acc;

    public DrawThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        //小明、小红取钱
        while (true) {
            acc.drawMoney(100000);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
