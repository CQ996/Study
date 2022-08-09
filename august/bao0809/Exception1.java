package august.bao0809;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @ClassName Test
 * @Description 异常处理:try-catch和throws
 * @Author CQ
 * @Date 2022/8/9 10:50
 * @Version 1.0
 */
public class Exception1 {
    public static void main(String[] args) throws FileNotFoundException {
                String str = "程前";
                String name1=null;

//                try {
//                    System.out.println(name1.length());
//                    Integer num1 = new Integer(str);
//                    //Integer.parseInt(String s)将会返回int常量。
//                    //Integer.valueOf(String s)将会返回Integer类型，如果存在缓存将会返回缓存中已有的对象。
//                    int num2 = Integer.parseInt(str);
//                    Integer num3 = Integer.valueOf(str);
//                    System.out.println(num1+"\t"+num2+"\t"+num3);
//                }catch(NumberFormatException f){
//                    System.out.println("数字格式异常:" + f);
//                }catch (ClassCastException c){
//                    System.out.println("类型转换异常:" + c);
//                }catch (NullPointerException p){
//                    System.out.println("空指针异常:" + p);
//                }finally{
//                    System.out.println("无论是否发生异常，finally 代码块中的代码总会被执行。" );
//                }

                f2();

    }
    public static void f2() throws FileNotFoundException,NullPointerException,ArithmeticException{
        //创建了一个文件流对象
        //编译时异常（必须要处理）：FileNotFoundException（文件找不到的异常）
        //使用throws，抛出异常，让调用f2()方法的调用者处理
        //throws后面的异常类型可以是方法中产生的异常，也可以是它的父类
        //throws关键字后也可以是 异常列表，即可以抛出多个异常
        FileInputStream fis=new FileInputStream("d://aa.txt");
    }
}
