package august.bao0823.work;

/**
 * @ClassName Work3
 * @Description 使用多线程机制实现银行的存取款问题。
 * @Author CQ
 * @Date 2022/8/23 12:52
 * @Version 1.0
 */
public class Work3 {
    public static void main(String[] args) {
        //1.定义线程类，创建一个共享的账户对象,初始有10万元
        Accounts acc = new Accounts(100000);

        //2.创建3个线程对象，三人同时取钱，其中1人同时还会存钱
        new DrawThreads(acc,"爸爸").start();
        new DrawThreads(acc,"小明").start();
        new DrawThreads(acc,"小红").start();

    }
}
//取钱的线程类
class DrawThreads extends Thread{
    private Accounts acc;
    public DrawThreads(Accounts acc, String name){
        super(name);
        this.acc=acc;
    }
    @Override
    public void run() {
        //加线程锁
        synchronized (DrawThreads.class){
            //取、存钱方法
            acc.drawMoney(20000,10000);
        }
    }
}

//存钱的线程类
//class SaveThread extends DrawThreads{
//
//    public SaveThread(Accounts acc, String name) {
//        super(acc, name);
//        synchronized (SaveThread.class){
//            acc.saveMoney(10000);
//        }
//
//    }
//}

//账户类
class Accounts {

    public Accounts() {
    }

    public Accounts( double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    private double money;
    private double money2;
    //爸爸存钱
//    public void saveMoney(double money){
//        int count=0;
//        while (true){
//            this.money+=money;
//            count++;
//            System.out.println("爸爸来存钱，存了"+money+"，现在账户余额："+this.money);
//            if(count==5){
//                break;
//            }
//        }
//    }
    //小明、小红
    public void drawMoney(double money,double money2) {
        int count=0;
        //0.获取谁在取钱，线程名字就是人名
        String name=Thread.currentThread().getName();
        while (true){
            this.money+=money2;
            count++;
            System.out.println("爸爸来存钱，存了"+money2+"，现在账户余额："+this.money);
            if(count==5){
                break;
            }
            //1.判断账户是否够钱
            if(this.money>=money){
                //2.取钱
                System.out.println(name+"来取钱，取走了"+money);
                //3.更新余额
                this.money-=money;
                System.out.println(name+"来取钱后，剩余："+this.money);
            }else {
                //4.余额不足
                System.out.println(name+"来取钱，余额不足！");
                break;
            }
        }

    }
}