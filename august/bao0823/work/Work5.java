package august.bao0823.work;


/**
 * @ClassName Work5
 * @Description 实现两个线程，一个打印奇数，一个打印偶数，每个线程的延迟时间不一样，实现奇数和偶数的交替打印。
 * @Author CQ
 * @Date 2022/8/23 12:52
 * @Version 1.0
 */
public class Work5 {
    private static int num;
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (num < 100) {
                    synchronized (this) {
                        if ((num%2) != 0) {
                            System.out.println(Thread.currentThread().getName() + ":" + num++);
                        }
                    }
                }

            }
        }, "偶数进程").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (num < 100) {
                    synchronized (this) {
                        if ((num%2) == 0) {
                            System.out.println(Thread.currentThread().getName() + ":" + num++);
                        }
                    }
                }

            }
        }, "奇数进程").start();
    }

}
