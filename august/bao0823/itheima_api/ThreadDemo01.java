package august.bao0823.itheima_api;

/**
 * @ClassName ThreadDemo01
 * @Description 给线程设置并获取名称
 * @Author CQ
 * @Date 2022/8/23 5:27
 * @Version 1.0
 */
public class ThreadDemo01 {
    //main方法是由主线程负责调度的
    public static void main(String[] args) {
        Thread t1=new MyThread("1号线程");
        //t1.setName("1号线程");
        t1.start();
        //System.out.println(t1.getName());

        Thread t2=new MyThread("2号线程");
        //t2.setName("2号线程");
        t2.start();
        //System.out.println(t2.getName());

        //哪个线程执行它，它就得到哪个线程对象（当前线程对象）
        //主线程的名称就叫main
        Thread m=Thread.currentThread();
        //System.out.println(m.getName());
        m.setName("最牛的线程");

        for (int i = 0; i < 5; i++) {
            System.out.println(m.getName()+"输出："+i);
        }
    }
}
