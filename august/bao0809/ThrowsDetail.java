package august.bao0809;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @ClassName ThrowsDetail
 * @Description Throws抛出细节
 * @Author CQ
 * @Date 2022/8/9 11:39
 * @Version 1.0
 */
public class ThrowsDetail {
    public static void main(String[] args) {
        f2();
    }
    public static void f2() throws ArithmeticException{
        //1.对于程序，编译时异常（必须要处理），比如try-catch或者throws
        //2.对于程序，运行时异常，程序如果没有处理，默认就是throws的方式处理

        int n1=10;
        int n2=0;
        double res=n1/n2;
    }
    public static void f1() throws FileNotFoundException {
        //1、因为f1抛出的是一个编译异常
        //2、即这时要求f1()必须处理这个编译异常
        //3、再f1()中，要么try-catch或者继续throws这个编译异常
        f3();//抛出异常
    }
    public static void f3() throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("d://aa.txt");
    }


    public static void f4() throws FileNotFoundException {
        //1、在f4()中调用f5()不报错
        //2、原因是f5()抛出的是运行异常
        //3、而Java中，并不要求程序员显示处理，因为有默认处理机制
        f5();
    }
    public static void f5() throws ArithmeticException {

    }
}
    class Father {
        public void method() throws RuntimeException{

        }
    }
    class Son extends Father {
        //3.子类重写父类方法时，对抛出异常的规定：子类重写的方法
        //所抛出的异常类型，要么和父类抛出的异常一致，要么为父类抛出异常类型的子类型
        //NullPointerException就是RuntimeException的子类
        //4.throws和try-catch二选一
        @Override
        public void method() throws NullPointerException{

        }
    }
