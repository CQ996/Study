package august.bao0823.itheima_api;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/23 5:26
 * @Version 1.0
 */
public class MyThread extends Thread{
    public MyThread() {
    }

    //通过构造器取线程名
    public MyThread(String name) {
        //为当前线程对象设置名称，送给父类的有参构造器初始化名称
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"线程输出："+i);
        }
    }
}
