package august.bao0824.threadpool_;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName TimerDemo1
 * @Description Timer定时器的使用:单线程,处理多任务时存在延时与定时器的时间有出入
 * 可能因为某个任务的异常使Timer线程死掉，从而影响后续任务执行
 * @Author CQ
 * @Date 2022/8/24 13:00
 * @Version 1.0
 */
public class TimerDemo1 {
    public static void main(String[] args) {
        //1.创建Timer定时器
        Timer timer = new Timer();//定时器本身就是一个单线程
        //2.调用方法，处理定时任务
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行AA~~"+new Date());
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },3000,2000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行BB~~"+new Date());
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },3000,2000);


    }
}
