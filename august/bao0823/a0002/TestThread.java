package august.bao0823.a0002;

/**
 * @ClassName TestThread
 * @Description 匿名子类写法
 * @Author CQ
 * @Date 2022/8/23 10:04
 * @Version 1.0
 */
public class TestThread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    if(i%2==0){
                        System.out.println(Thread.currentThread().getName()+"\n"+i);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    if(i%2==0){
                        System.out.println(Thread.currentThread().getName()+"\n"+i);
                    }
                }
            }
        }.start();

    }
}
