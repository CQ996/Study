package august.bao0823.itheima_create;

/**
 * @ClassName Runnable_Demo2
 * @Description 多线程的创建方式二：实现Runnable任务接口
 * 优点：只实现接口，可以继续继承类和实现接口，扩展性更强
 * 缺点：编程多一层对象包装，如果线程有执行结果是不能直接返回的
 * @Author CQ
 * @Date 2022/8/23 4:13
 * @Version 1.0
 */
public class Runnable_Demo2 {
    public static void main(String[] args) {
        //3.创建一个任务对象
        Runnable target = new MyRunnable();
        //4.把任务对象交给Thread处理
        Thread t=new Thread(target,"1号线程");
        //5.启动线程
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出"+i);
        }
    }
}

//定义一个线程任务类MyRunnable实现Runnable接口
class MyRunnable implements Runnable {
    //重写run方法，定义线程任务
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"输出" + i);
        }
    }
}