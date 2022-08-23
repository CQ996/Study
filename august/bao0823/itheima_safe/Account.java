package august.bao0823.itheima_safe;

/**
 * @ClassName Account
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/23 6:03
 * @Version 1.0
 */
public class Account {

    public Account() {
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
    //小明、小红
    public void drawMoney(double money) {
        //0.获取谁在取钱，线程名字就是人名
        String name=Thread.currentThread().getName();
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
        }
    }
}
