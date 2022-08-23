package august.bao0823.work;

/**
 * @ClassName Work1
 * @Description 建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数。
 * @Author CQ
 * @Date 2022/8/23 12:52
 * @Version 1.0
 */
public class Work1 {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        Thread t1 = new Thread(m1);
        t1.setName("偶数进程：");

        MyThread2 m2 = new MyThread2();
        Thread t2 = new Thread(m2);
        t2.setName("奇数进程：");
        t1.start();
        t2.start();

    }
}

class MyThread1 implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<=100; i++) {
            if(i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class MyThread2 extends MyThread1{

    @Override
    public void run() {
        for(int i=0; i<=100; i++) {
            if(i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}