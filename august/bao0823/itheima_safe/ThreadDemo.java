package august.bao0823.itheima_safe;

/**
 * @ClassName ThreadDome1
 * @Description 模拟取钱案例
 * @Author CQ
 * @Date 2022/8/23 6:02
 * @Version 1.0
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //1.定义线程类，创建一个共享的账户对象
        Account acc = new Account("ICBC-1111",100000);

        //2.创建2个线程对象，代表两人同时取钱
        new DrawThread(acc,"小明").start();
        new DrawThread(acc,"小红").start();

    }
}
