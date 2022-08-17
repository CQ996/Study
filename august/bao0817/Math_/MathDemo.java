package august.bao0817.Math_;

/**
 * @ClassName MathDemo
 * @Description Math工具类的使用
 * @Author CQ
 * @Date 2022/8/16 23:47
 * @Version 1.0
 */
public class MathDemo {
    public static void main(String[] args) {
        //1.取绝对值：返回正数
        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-10.3));

        //2.向上取整：
        System.out.println(Math.ceil(-10.3));//-10
        System.out.println(Math.ceil(4.1));//5
        //3.向下取整：
        System.out.println(Math.floor(-10.3));//-11
        System.out.println(Math.floor(4.1));//4

        //4.求指数次方
        System.out.println(Math.pow(2,3));//8
        //5.四舍五入
        System.out.println(Math.round(4.1));//4
        System.out.println(Math.round(4.7));//5

        System.out.println(Math.random());//0.0~1.0(包前不包后)

        //3~9随机整数    (0~6)+3
        System.out.println(Math.random()*7);//0~7之间不包含7
        System.out.println((int)(Math.random()*7)+3);
    }
}
