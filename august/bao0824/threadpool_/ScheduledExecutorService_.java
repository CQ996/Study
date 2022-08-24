package august.bao0824.threadpool_;

import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName ScheduledExecutorService_
 * @Description ScheduledExecutorService线程池定时器，多任务不会互相影响
 * @Author CQ
 * @Date 2022/8/24 13:11
 * @Version 1.0
 */
public class ScheduledExecutorService_ {
    public static void main(String[] args) {
        //创建ScheduledExecutorService线程池，做定时器
        ScheduledExecutorService pool= Executors.newScheduledThreadPool(3);
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行AA~~"+new Date());
            }
        },0,2, TimeUnit.SECONDS);
    }
}
