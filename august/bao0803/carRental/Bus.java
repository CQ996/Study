package august.bao0803.carRental;

/**
 * @ClassName Bus
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/3 22:43
 * @Version 1.0
 */
public class Bus extends MotoVehicle{
    public Bus(){

    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
        calcRent(days);
    }

    //座位数
    private int seatCount;



    //租赁天数
    private int days;

    public Bus(String no,String brand,double rate,int seatCount){
        super(no,brand,rate);
        this.seatCount=seatCount;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("一共需付租金："+calcRent(days)+"元");
    }
}
