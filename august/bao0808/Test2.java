package august.bao0808;

/**
 * @ClassName Test2
 * @Description 接口模拟汽车加油功能
 * @Author CQ
 * @Date 2022/8/8 16:03
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        //回顾多态：多态前提：以子父类继承关系为前提或者以接口实现为前提

        //如何体现多态
        /*//方式一：同一个父接口类型 指向 多个不同子类实例。
        JiaYouDevice device1 = new BmwCar();
                     device1 = new BydCar();
        //方式二：方法调用时，将产生多态调用
        device1.jiaYou();*/

        //模拟2种汽车：
        JiaYouDevice car1 = new BmwCar();
        JiaYouDevice car2 = new BydCar();

        //模拟加油
        jiaYouStation(car1);
        jiaYouStation(car2);
    }

    //优化：采用多态。1.将父接口类型作为
    public static void jiaYouStation(JiaYouDevice device){
        device.jiaYou();
    }
}


//模拟父类接口：加油功能。
interface JiaYouDevice{
    public void jiaYou();
}

//模拟子实现类：Bmw ， Byd
class BmwCar implements JiaYouDevice {

    @Override
    public void jiaYou() {
        System.out.println("模拟宝马汽车加油...");
    }
}
class BydCar implements JiaYouDevice{

    @Override
    public void jiaYou() {
        System.out.println("模拟比亚迪汽车加油...");
    }
}