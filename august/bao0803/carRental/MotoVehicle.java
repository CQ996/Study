package august.bao0803.carRental;

/**
 * @ClassName MotoVehicle
 * @Description 汽车租赁继承
 * @Author CQ
 * @Date 2022/8/3 22:42
 * @Version 1.0
 */
public class MotoVehicle {
    public MotoVehicle(){

    }

    //车牌号
    protected String no;
    //品牌
    protected String brand;
    //日租金
    protected double rate;

    public MotoVehicle(String no,String brand,double rate){
        this.no=no;
        this.brand=brand;
        this.rate=rate;
    }


    public double calcRent(int days){
        double money=days*rate;
        return money;
    }
    public void show(){
        System.out.println("你租了一辆"+brand+"车牌号为："+no);
    }
}
