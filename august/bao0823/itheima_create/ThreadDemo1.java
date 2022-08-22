package august.bao0823.itheima_create;

/**
 * @ClassName ThreadDemo1继承Thread类实现
 * @Description 多线程的创建方式一：继承Thread类,编码简单但只继承了一个类不利于扩展
 * @Author CQ
 * @Date 2022/8/23 3:56
 * @Version 1.0
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        //3.new一个新线程对象
        Thread t=new MyThread();
        //4.调用start方法启动线程（执行的还是run方法）
        t.start();
        //主线程任务需要放到start方法之后
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出："+i);
        }
    }
}
//1.定义一个线程类，必须要继承Thread类
class MyThread extends Thread{
    //2.重写run方法，定义线程做什么

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行输出"+i);
        }
    }
}