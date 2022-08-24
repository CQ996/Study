package august.bao0824.threadpool_;

import august.bao0823.itheima_create.MyCallable;

import java.util.concurrent.*;

/**
 * @ClassName ThreadPoolDemo2
 * @Description 自定义线程池对象，并测试特性2
 * @Author CQ
 * @Date 2022/8/23 18:47
 * @Version 1.0
 */
public class ThreadPoolDemo2 {
    public static void main(String[] args) {
        //1.创建线程池对象
        /**
         * public ThreadPoolExecutor(int corePoolSize,核心线程数量
         *                               int maximumPoolSize,最大线程数量
         *                               long keepAliveTime,最大存活时间
         *                               TimeUnit unit,存活时间单位
         *               任务等待队列（缓存）BlockingQueue<Runnable> workQueue) {
         *        this(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue,
         *         默认线程工场Executors.defaultThreadFactory(), defaultHandler)超出任务能力处理办法
         */
        ExecutorService pool=new ThreadPoolExecutor(3,5,
                6, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        //2.给任务线程池处理
        Future<String> f1=pool.submit(new MyCallable(100));
        Future<String> f2=pool.submit(new MyCallable(200));
        Future<String> f3=pool.submit(new MyCallable(300));
        Future<String> f4=pool.submit(new MyCallable(400));
        Future<String> f5=pool.submit(new MyCallable(400));

        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
            System.out.println(f4.get());
            System.out.println(f5.get());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
class MyRunnable1 implements Runnable{
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