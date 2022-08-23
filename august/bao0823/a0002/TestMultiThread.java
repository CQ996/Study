package august.bao0823.a0002;

/**
 * @ClassName TestMutilThready
 * @Description 多线程打印0~100偶数
 * @Author CQ
 * @Date 2022/8/23 9:18
 * @Version 1.0
 */
public class TestMultiThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("乾坤大挪移：");
        myThread.start();

        MyThread myThread2 = new MyThread();
        myThread2.setName("九阳神功：");
        myThread2.start();
    }
}

class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+"\n"+i);
            }
        }
    }
}