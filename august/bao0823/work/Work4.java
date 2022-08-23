package august.bao0823.work;

/**
 * @ClassName Work4
 * @Description 使用多线程的2中实现方式实现一个打印1-1000之间的素数（质数）的线程。
 * @Author CQ
 * @Date 2022/8/23 12:52
 * @Version 1.0
 */
public class Work4 {
    public static void main(String[] args) {

        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 3; i <= 1000; i++) {
                    for (int j = 2; j < 1000; j++) {
                        if (i % j == 0 && i != j) {
                            break;
                        }
                        synchronized (this) {
                            if (i % j == 0 && i == j) {
                                System.out.println(Thread.currentThread().getName()+i);
                                break;
                            }
                        }

                    }
                }
            }
        },"素数进程一：").start();

        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 3; i <= 1000; i++) {
                    for (int j = 2; j < 1000; j++) {
                        if (i % j == 0 && i != j) {
                            break;
                        }
                        synchronized (this) {
                            if (i % j == 0 && i == j) {
                                System.out.println(Thread.currentThread().getName()+i);
                                break;
                            }
                        }
                    }
                }
            }
        },"素数进程二：").start();



    }
}
