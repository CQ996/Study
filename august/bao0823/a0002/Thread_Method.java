package august.bao0823.a0002;

/**
 * @ClassName Thread_Method
 * @Description Thread常用方法---yield()；
 * yield()方法调用后线程只是暂时的将调度权让给别人，但立刻可以回到竞争线程锁的状态；
 * @Author CQ
 * @Date 2022/8/23 10:12
 * @Version 1.0
 */
public class Thread_Method {
    public static void main(String[] args) {
        MyThread1 m1=new MyThread1("宋江：");
        MyThread2 m2=new MyThread2("卢俊义：");

        m1.start();
        m2.start();

    }
}
//模拟宋江约会
class MyThread1 extends Thread{
    public MyThread1() {
    }

    public MyThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+"\n"+i);
            }
            if(i%20==0){
                yield();//释放当前CPU的执行权，让给卢俊义
            }
        }
    }
}
//模拟卢俊义约会
class MyThread2 extends Thread{
    public MyThread2() {
    }

    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+"\n"+i);
            }
        }
    }
}
