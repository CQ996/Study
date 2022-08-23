package august.bao0824.thread_communication;

/**
 * @ClassName Account
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/23 17:40
 * @Version 1.0
 */
public class Account {
    public Account() {
    }
    //取钱
    public synchronized void drawMoney(double money) {
        try {
            String name=Thread.currentThread().getName();
            if(this.money>=money){
                //有钱能取
                this.money-=money;
                System.out.println(name+"来取钱"+money+"成功！余额是："+this.money);
                //没钱了
                this.notifyAll();//唤醒所有线程
                this.wait();//锁对象，让当前线程进入等待
            }else {
                //没钱取
                //唤醒别人，等待自己
                this.notifyAll();//唤醒所有线程
                this.wait();//锁对象，让当前线程进入等待

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //存钱
    public synchronized void deposit(double money) {
        try {
            String name=Thread.currentThread().getName();
            if(this.money==0){
                this.money+=money;
                System.out.println(name+"存钱"+money+"成功！余额是："+this.money);
                //有钱了，唤醒别人，等待自己
                this.notifyAll();//唤醒所有线程
                this.wait();//锁对象，让当前线程进入等待
            }else {
                //有钱，不存钱
                this.notifyAll();//唤醒所有线程
                this.wait();//锁对象，让当前线程进入等待
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    private String cardId;
    private double money;



}
