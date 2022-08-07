package august.bao0803.charge;

/**
 * @ClassName Truck
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/3 14:17
 * @Version 1.0
 */
public class Truck extends Vehicle{
    public Truck(){

    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTruckCond() {
        return truckCond;
    }

    public void setTruckCond(int truckCond) {
        this.truckCond = truckCond;
    }
    //费率
    public double rate;
    //最大允许总质量
    private int weight;
    //货车车辆长度
    private int truckCond;
    //车轴数量
    private int zhounum;
    public Truck(int length,String plateNo,int weight, int truckCond,int zhounum){
        super(length,plateNo);
        this.weight=weight;
        this.truckCond=truckCond;
        this.zhounum=zhounum;
    }
    public double rate(){
        if(zhounum==2){
            if(truckCond<length && weight<4500){
                this.rate=0.6;
            }else if(truckCond>=length && weight>=4500){
                this.rate=0.9;
            }
        }else if(zhounum==3){
            this.rate=1.02;
        }else if(zhounum==4){
            this.rate=1.315;
        }else if(zhounum==5 || zhounum==6){
            this.rate=1.428;
        }
        super.getRate(this.rate);
        return this.rate;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("车长："+truckCond);
        System.out.println("最大允许总质量："+weight);
        System.out.println("车轴数："+zhounum);
        rate();
    }

    @Override
    public void getRate(double rate) {
        super.getRate(rate);
    }
}
