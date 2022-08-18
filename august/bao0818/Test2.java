package august.bao0818;

import java.util.Random;

/**
 * @ClassName Test2
 * @Description Math和Random介绍
 * @Author CQ
 * @Date 2022/8/18 14:51
 * @Version 1.0
 */
public class Test2 {

    public static void main(String[] args) {

        //Math , Random :
        int r = 5;
        double result = Math.PI * r* r;
        System.out.println( result );

        //floor(double a) : 取整.
        System.out.println( Math.floor( 3.54 ) );

        //pow(double a, double b)  : a的b次方.
        System.out.println( Math.pow(5,3) );

        //random()  : 随机数方法. 随机产生0~1之间.不等于1.
        System.out.println( Math.random() );


        //round(double a) : 四舍五入.
        System.out.println( Math.round(3.54) );


        //Random : 一个随机数生成器.   过程:  种子 + 公式计算得出随机数.
        Random random = new Random();
        int r1 = random.nextInt();//int最大值与最小值之间.
        int r2 = random.nextInt(100);//0-100之间.不含100.
        System.out.println("int随机数结果为: " + r2);


        //特殊情况: 采用相同种子的生成器 + 相同时间进行随机生成 = 相同的随机数.
        Random random2 = new Random( 20 );
        int r3 = random2.nextInt();

        Random random3 = new Random( 20 );
        int r4 = random3.nextInt();
        System.out.println(r3+ " ===== " + r4);

    }
}
