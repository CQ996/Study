package august.bao0803.charge;
/**
 * @ClassName Test
 * @Description 继承——高速收费站收费计算
 * @Author CQ
 * @Date 2022/8/3 14:23
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Bus bus=new Bus(6000,"皖A88888",6,6000);
        bus.print();
        bus.getRate(bus.rate);
        Truck truck=new Truck(6000,"皖B66666",5000,5000,6);
        truck.print();
        truck.getRate(truck.rate);
    }
}
