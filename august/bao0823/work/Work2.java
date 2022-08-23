package august.bao0823.work;


/**
 * @ClassName Work2
 * @Description 模拟火车票联网售票系统：多个线程同时出票，保证每张出票的编号连续且不重复。
 * @Author CQ
 * @Date 2022/8/23 12:52
 * @Version 1.0
 */
public class Work2 {
    public static void main(String[] args) {
        //1.定义线程类，创建一个共享的票池对象
        Ticket ticket = new Ticket(100);
        //2.创建2个线程对象，代表两人渠道同时买票
        new Buy("手机渠道",ticket).start();
        new Buy("电脑渠道",ticket).start();
    }
}
//购票线程
class Buy extends Thread{
    public Buy(Ticket ticket) {
        this.ticket = ticket;
    }

    public Buy(String name, Ticket ticket) {
        super(name);
        this.ticket = ticket;
    }

    private Ticket ticket;
    @Override
    public void run() {
        synchronized (Buy.class){
            ticket.buyTicket(1);
        }
    }
}
//票库类
class Ticket{
    //总票数
    private int num;
    //购票途径
    private String channel;
    //购票的两种途径
    public void buyTicket(int num){
        //0.获取购票途径（线程）
        String channel=Thread.currentThread().getName();
        while(true) {
            //1.判断票是否还够
            if(this.num>=num){
                //2.取票
                System.out.println(channel+"来买票，买走了"+num);
                //3.更新剩余票数
                this.num-=num;
                System.out.println(channel+"来买票后，剩余："+this.num);
            }else {
                //4.没票了
                System.out.println(channel+"来买票，没票了！");
                break;
            }
        }

    }


    public Ticket() {
    }

    public Ticket(int num) {
        this.num = num;
    }

    public Ticket(String channel,int num ) {
        this.num = num;
        this.channel = channel;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }




}
