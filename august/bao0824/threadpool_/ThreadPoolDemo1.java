package august.bao0824.threadpool_;

import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;

import java.util.concurrent.*;

/**
 * @ClassName ThreadPoolDemo1
 * @Description 自定义线程池对象，并测试特性
 * @Author CQ
 * @Date 2022/8/23 18:47
 * @Version 1.0
 */
public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        //1.创建线程池对象
        /**
         * public ThreadPoolExecutor(int corePoolSize,核心线程数量
         *                               int maximumPoolSize,最大线程数量
         *                               long keepAliveTime,最大存活时间
         *                               TimeUnit unit,存活时间单位
         *               任务等待队列（缓存）BlockingQueue<Runnable> workQueue) {
         *        this(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue,
         *              默认线程工场Executors.defaultThreadFactory(), defaultHandler)超出任务能力处理办法
         */
        ExecutorService pool=new ThreadPoolExecutor(3,5,
                6, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        //2.给任务线程池处理
        Runnable target = new MyRunnable();
        //3个核心线程
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        //5个任务队列
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        //创建临时线程
        pool.execute(target);
        pool.execute(target);
        //不创建，触发拒绝策略
        //pool.execute(target);

        //关闭线程（开发中一班不使用）
        //pool.shutdownNow();//立即关闭，即使任务没有完成，会丢失任务！
        pool.shutdown();//会等待全部任务执行完毕之后再关闭（相对建议使用）

    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"输出了："+i);
        }
        try {
            System.out.println(Thread.currentThread().getName()+"本任务与线程绑定了，线程进入休眠了");
            Thread.sleep(1000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}