package august.bao0803.carRental;

/**
 * @ClassName Car
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/3 22:42
 * @Version 1.0
 */
public class Car extends MotoVehicle{
    public Car(){

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
        calcRent(days);
    }

    //型号
    private String type;
    //租赁天数
    private int days;

    public Car(String no,String brand,double rate){
        super(no,brand,rate);
        this.type=brand;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("一共需付租金："+calcRent(days)+"元");
    }
}
