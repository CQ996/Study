package august.bao0803.charge;

/**
 * @ClassName Bus
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/3 14:17
 * @Version 1.0
 */
public class Bus extends Vehicle{
    public Bus(){

    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getbusCond() {
        return busCond;
    }

    public void setbusCond(int busCond) {
        busCond = busCond;
    }
    //费率
    public double rate;
    //乘客人数
    private int passengers;
    //车辆长度
    private int busCond;

    public Bus(int length,String plateNo,int passengers, int busCond){
        super(length,plateNo);
        this.passengers=passengers;
        this.busCond=busCond;
    }
    public double rate(){
        if(busCond<length && passengers<=19){
            this.rate=0.6;
        }else if(busCond>=length){
            if(passengers<=39 || passengers>=40){
                this.rate=0.9;
            }
        }
        super.getRate(this.rate);
        return this.rate;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("车长："+busCond);
        System.out.println("核定载人数："+passengers);
        rate();
    }

    @Override
    public void getRate(double rate) {
        super.getRate(rate);
    }
}
