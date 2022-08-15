package august.bao0809;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @ClassName Test2
 * @Description 单路异常捕获 多路异常捕获
 * @Author CQ
 * @Date 2022/8/9 15:09
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        //异常处理方式：手动捕获处理。try_catch_finally
        //需求：模拟一个编译异常。当读取的文件找不到时，给出温馨提示即可。
        try {
            //可能产生异常的代码：FileNotFoundException
            FileReader fr = new FileReader("1.ppt");
            System.out.println("正在加载中······");//上面找不到文件这里就不走

            //模拟其他异常：ArithmeticException
            int a = 10/0;

            //更多异常类型······


        }catch (FileNotFoundException e1){//当以上代码块产生异常后，我们将匹配对应的类型，给予处理。
            //识别到了异常对象：e1.
            String msg=e1.getMessage();

            //给予默认的处理方式：
            System.out.println("抱歉，产生了故障，可能是："+msg);
            //模拟演示官方的默认处理方式：
            //e1.printStackTrace();
        }catch (ArithmeticException e1){
            System.out.println("抱歉，不能处理");
        }catch (Exception e1){
            //如果以上两个子类异常类型都不匹配时，则进入该父类异常类型中处理。
            System.out.println("抱歉，服务器忙！！！");
        }finally {
            //表示：以上异常处理，无论是否产生异常时，都将执行触发的代码块。
            //模拟：必要执行关闭程序
            System.out.println("模拟程序关闭！！！");
        }


    }
}
