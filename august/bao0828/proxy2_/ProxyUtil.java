package august.bao0828.proxy2_;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyUtil
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/27 15:05
 * @Version 1.0
 */
public class ProxyUtil {
    //通过静态方法，为用户业务对象返回一个代理对象
    public static UserService getProxy(UserService us){
        /**
         * public static Object newProxyInstance(ClassLoader loader,
         *        Class<?>[] interfaces,接口列表
         *        InvocationHandler h) 代理的核心处理程序
         */
        //s.getClass().getClassLoader()  对象.类对象.类加载器
        //s.getClass().getInterfaces()   对象.类对象.接口
        //(Skill)   代理对象也需要实现明星的接口，因此可以直接转接口
        return (UserService) Proxy.newProxyInstance(us.getClass().getClassLoader(), us.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //真正触发对象的行为执行的。
                        long startTime = System.currentTimeMillis();
                        Object rs = method.invoke(us, args);
                        long endTime = System.currentTimeMillis();
                        System.out.println(method.getName()+"方法耗时"+ (endTime-startTime)/1000 + "s");
                        return rs;
                    }
                });
    }
}