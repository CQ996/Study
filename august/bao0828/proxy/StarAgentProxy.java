package august.bao0828.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName StarAgent
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/27 14:04
 * @Version 1.0
 */
public class StarAgentProxy {
    //设计一个方法返回一个明星对象的代理对象
    public static Skill getProxy(Star s){
        //为明星对象生成一个代理对象
        /**
         * public static Object newProxyInstance(ClassLoader loader,
         *        Class<?>[] interfaces,接口列表
         *        InvocationHandler h) 代理的核心处理程序
         */
        //s.getClass().getClassLoader()  对象.类对象.类加载器
        //s.getClass().getInterfaces()   对象.类对象.接口
        //(Skill)   代理对象也需要实现明星的接口，因此可以直接转接口
        return (Skill) Proxy.newProxyInstance(s.getClass().getClassLoader(), s.getClass().getInterfaces(),
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("收订金···");
                //让Star执行唱歌跳舞等方法
                //method代表正在调用的方法对象
                //args 是Star方法里的参数
                Object rs = method.invoke(s, args);
                System.out.println("收尾款···");
                return rs;
            }
        });
    }
}
