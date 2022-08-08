package august.bao0808.car;

/**
 * @ClassName BmwCar
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/8 14:53
 * @Version 1.0
 */
public class BmwCar extends Transport{
    //子类如果不重写抽象方法：直接继承，导致子类也必须声明为抽象类

    //子类对父类抽象方法：必须重写实现。
    @Override
    public void run() {
        System.out.println("宝马汽车100公里每小时速度行驶···");
    }
}
