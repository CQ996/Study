package august.bao0828.proxy;

/**
 * @ClassName Text
 * @Description 学习开发出一个代理对象，理解动态代理的执行流程
 * @Author CQ
 * @Date 2022/8/27 13:52
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //1.创建一个对象,该对象必须实现接口
        Star s = new Star("胡永见");
        //为Star对象生成一个代理对象
        Skill s2 = StarAgentProxy.getProxy(s);
        s2.jump();
        s2.sing();
    }
}
