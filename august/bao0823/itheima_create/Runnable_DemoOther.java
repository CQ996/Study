package august.bao0823.itheima_create;

/**
 * @ClassName Runnable_Demo2
 * @Description 多线程的创建方式二：实现Runnable任务接口2:匿名内部类方式实现，多种语法形式
 * @Author CQ
 * @Date 2022/8/23 4:13
 * @Version 1.0
 */
public class Runnable_DemoOther {
    public static void main(String[] args) {
        //创建一个任务对象：匿名内部类
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程1执行输出" + i);
                }
            }
        };
        Thread t=new Thread(target);
        t.start();


        new Thread(
                new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程2执行输出" + i);
                }
            }
        }).start();


        new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程3执行输出" + i);
                }
        }).start();


        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出"+i);
        }
    }
}
