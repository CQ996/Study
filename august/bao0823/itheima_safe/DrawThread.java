package august.bao0823.itheima_safe;

/**
 * @ClassName DrawThread
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/23 6:07
 * @Version 1.0
 */
//取钱的线程类
public class DrawThread extends Thread{
    private Account acc;
    public DrawThread(Account acc,String name){
        super(name);
        this.acc=acc;
    }
    @Override
    public void run() {
        //加线程锁
        synchronized (DrawThread.class){
            //取钱方法
            acc.drawMoney(100000);
        }

    }
}
