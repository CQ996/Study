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

        //回顾多态:  多态前提: 必须以子父类继承关系为前提, 或者以子类与父接口实现为前提.

        //如何体现多态:

        //方式一:  同一个父接口类型 指向 多个不同子类实例.
        JiaYouDevice device1 = new BmwCar();
        device1 = new BydCar();

        //方式二: 方法调用时. 将产生多态调用.
        device1.jiaYou();


        //好处:

        //模拟2种汽车:
        BmwCar car1 = new BmwCar();
        BydCar car2 = new BydCar();

        //模拟加油:
        jiayouStation( car1 );
        jiayouStation( car2 );
        // jiayouStation( xxx );  支持扩展更多子类型实例.





    }

    //模拟加油站加油功能:
//    public static void jiayouStation(BmwCar car1){
//        car1.jiaYou();
//    }
//
//    public static void jiayouStation(BydCar car1){
//        car1.jiaYou();
//    }

    //......缺点: 不方便扩展更多的子类.


    //优化:  采用多态.  1.将父接口类型作为方法形参定义. 支持传入任意子类实例.
    public static void jiayouStation( JiaYouDevice device ){
        device.jiaYou();
    }


}

// 模拟多态:

//模拟父接口: 加油功能.
interface JiaYouDevice{
    public void jiaYou();
}

//模拟子实现类: BmwCar , BydCar
class BmwCar implements JiaYouDevice{

    @Override
    public void jiaYou() {
        System.out.println("模拟宝马加油....");
    }
}

class BydCar implements JiaYouDevice{

    @Override
    public void jiaYou() {
        System.out.println("模拟比亚迪加油....");
    }
}