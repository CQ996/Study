package august.bao0808.car;

/**
 * @ClassName Test
 * @Description 抽象类模拟 车 行驶
 * @Author CQ
 * @Date 2022/8/8 14:19
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //模拟一辆摩托车
        MotoCar c1=new MotoCar();
        c1.run();
        BmwCar c2=new BmwCar();
        c2.run();
    }
}
