package august.bao0809;

/**
 * @ClassName Test3
 * @Description throws关键字异常处理方式演示
 * @Author CQ
 * @Date 2022/8/9 16:02
 * @Version 1.0
 */

/*
* 用户：   点击启动
*   ↓
*   ↓
* 启动JVM虚拟机 默认处理方案: e1.printStackTrace();
*   ↓
*   ↓
* main()throws Exception
* */
public class Test3 {
    public static void main(String[] args){

//        int a=10/0;
//
//        //模拟编译异常：
//        Exception e1=new Exception("电脑故障");
//
//        //手动抛出异常实例对象：throw 异常对象；
//        throw e1;

        //测试调用
        try {
            task1();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //编写业务代码
    public static void task1()throws ArithmeticException,Exception{
        int a=10/0;

        //模拟编译异常：
        Exception e1=new Exception("电脑故障");
        //手动抛出异常实例对象：throw 异常对象；
        throw e1;
    }
}
