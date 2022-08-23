package august.bao0823.a0002;

/**
 * @ClassName Thread_priority
 * @Description 线程优先级：
 *              公共静态 int NORM_PRIORITY 10
 *              公共静态 int MIN_PRIORITY  1
 *              公共静态 int MAX_PRIORITY  5
 *              如何设置、获取线程优先级
 *              getPriority()
 *              setPriorty(int p)
 *              高优先级的线程要抢占低优先级线程的CPU的执行权，但是只是概率上讲。
 *              高优先级的线程，高概率先执行，但并不意味只有高优先级的线程执行完以后低优先级线程才会执行
 * @Author CQ
 * @Date 2022/8/23 11:16
 * @Version 1.0
 */
public class Thread_priority {
    public static void main(String[] args) {
        MyThread myThread7 = new MyThread("宋江");
        MyThread myThread8 = new MyThread("卢俊义");
        //设置线程优先级
        myThread7.setPriority(Thread.MAX_PRIORITY);
        myThread8.setPriority(Thread.MIN_PRIORITY);
        myThread7.start();
        myThread8.start();
    }
}
