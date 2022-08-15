package august.bao0809;

import java.io.FileReader;

/**
 * @ClassName Test1
 * @Description 了解 编译异常 和 运行异常
 * @Author CQ
 * @Date 2022/8/9 14:48
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        //Throwable 异常顶级父类  Error错误类    Exception异常类

        //  Exception异常类：       编译异常：除RuntimeException以外的异常
        //演示编译异常，编码过程中，自动产生
        //FileReader fr= new FileReader("1.txt");
        //演示编译异常，编码过程中，手动产生
        //Exception e1=new Exception("电脑故障");
        //throw e1;

        //总结，编译异常需要预处理


        //  Exception异常类：       运行异常：RuntimeException类型
        //演示运行异常，编码过程中，自动产生
        //int a=10/0;
        //演示运行异常，编码过程中，手动产生
        RuntimeException e1=new RuntimeException("电脑故障");
        throw e1;

        //总结，运行异常无需预处理，但是可以进行处理

    }
}
