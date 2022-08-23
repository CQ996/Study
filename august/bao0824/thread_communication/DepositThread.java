package august.bao0824.thread_communication;

/**
 * @ClassName DrawThread
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/23 17:43
 * @Version 1.0
 */
public class DepositThread extends Thread {
    private Account acc;

    public DepositThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        //三个爸爸存钱
        while (true) {
            acc.deposit(100000);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
