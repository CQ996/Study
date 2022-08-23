package august.bao0824.thread_communication;

/**
 * @ClassName ThreadDemo
 * @Description 线程通信的流程:3人存钱2人取钱
 * 三个方法：notifyAll()--唤醒所有线程；wait()--让当前线程进入等待；
 * notify()--唤醒正在等待锁对象的单个线程；
 * 这三个方法应使用当前同步锁对象进行调用
 * @Author CQ
 * @Date 2022/8/23 17:38
 * @Version 1.0
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //三个爸爸存钱(生产者)，两个孩子（消费者）存钱（只能一存10万，一取10万）
        //1.创建5人共同账户
        Account acc=new Account("888888",0);
        //2.创建2个取钱线程
        new DrawThread(acc,"小明").start();
        new DrawThread(acc,"小红").start();

        //3.创建3个存钱线程
        new DepositThread(acc,"亲爹").start();
        new DepositThread(acc,"干爹").start();
        new DepositThread(acc,"岳父").start();
    }
}
