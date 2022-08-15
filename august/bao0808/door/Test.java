package august.bao0808.door;


/**
 * @ClassName Test
 * @Description 抽象类和接口的综合案例 门和汽车
 * @Author CQ
 * @Date 2022/8/8 17:03
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Door door=null;
        SecurityDoor sd=new SecurityDoor("不锈钢", 2000);
        sd.Lock();
        sd.show();
        GlassDoor gs = new GlassDoor("玻璃",500);
        gs.show();
        Car car=new Car();
        car.Lock();
        car.Unlock();

    }
}
