package august.bao0823.itheima_create;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @ClassName Callable_Demo3
 * @Description 多线程的创建方式三：实现Callable接口，结合FutureTask完成
 * 优点：只实现接口，可以继续继承类和实现接口，扩展性更强；可以在线程执行完毕后可获取线程执行的结果
 * 缺点：编码复杂
 * @Author CQ
 * @Date 2022/8/23 4:52
 * @Version 1.0
 */
public class Callable_Demo3 {
    public static void main(String[] args) {
        //3.创建Callable任务对象
        Callable<String> call=new MyCallable(100);
        //4.把Callable任务对象封装成FutureTask对象
        //FutureTask对象的作用1：是Runnable的对象（实现Runnable接口），可以交给Thread了
        //FutureTask对象的作用2：可以在线程执行完毕后可以通过调用其get方法得到线程执行完成的结果
        FutureTask<String> f1=new FutureTask<>(call);
        //5.交给线程处理
        Thread t1=new Thread(f1);
        //6.启动线程
        t1.start();

        Callable<String> call2=new MyCallable(10);
        FutureTask<String> f2=new FutureTask<>(call2);
        Thread t2=new Thread(f2);
        t2.start();

        try {
            //如果f1任务没有执行完毕，此处代码会等待，直到线程1跑完才提取结果
            String rs1=f1.get();
            System.out.println("第一个结果："+rs1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String rs2=f2.get();
            System.out.println("第二个结果："+rs2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

