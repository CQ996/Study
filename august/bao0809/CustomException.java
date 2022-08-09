package august.bao0809;

/**
 * @ClassName CustomException
 * @Description 自定义异常
 * @Author CQ
 * @Date 2022/8/9 12:33
 * @Version 1.0
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 80;
        //年龄在18~120，否则抛出异常
        if (!(age >= 18 && age <= 120)){
            //这里我们可以通过构造器，设置信息
            throw new AgeException("年龄需要在18~120之间");
        }
        System.out.println("你的年龄范围正确！");
    }
}

//自定义一个异常
//1、一半自定义异常是继承RuntimeException
//2、因为运行异常有默认处理机制
//3、即比较方便
class AgeException extends RuntimeException {
    public AgeException(String message) {//构造器
        super(message);
    }
}
