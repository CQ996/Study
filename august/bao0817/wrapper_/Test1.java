package august.bao0817.wrapper_;

/**
 * @ClassName Test1
 * @Description 包装类对象的使用分析演示
 * @Author CQ
 * @Date 2022/8/17 16:19
 * @Version 1.0
 */
public class Test1 {

    public static void main(String[] args) {

        //8个基本数据类型

        //8个包装类:
        //  Byte    Short     Integer   Long
        //  Float   Double
        //  Boolean Character

        //需求: 基本类型 ----> 包装类对象.
        int n = 10;
        Integer num1 = new Integer( n );

        Integer num2 = n; //将基本类型直接存储至包装类型对象中.被称为自动装箱.

        String n2 = "20";
        Integer num3 = new Integer( n2 );

        //需求:  更多的包装类使用方法和属性.
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        System.out.println(maxValue);
        System.out.println(minValue);

        //byteValue() doubleValue() floatValue() intValue() longValue()shortValue()

        int n3 = num1.intValue();
        long n4 = num1.longValue();
        double n5 = num1.doubleValue();
        System.out.println(n3+" -- " + n4+" -- " + n5);

        //parseInt(String s) toString() valueOf(int i) valueOf(String s)
        int n6 = Integer.parseInt("30");
        String n7 = num1.toString();
        Integer num4 = Integer.valueOf(40);
        Integer num5 = Integer.valueOf("50");
        System.out.println(n6 +" --- " +n7);
        System.out.println(num4 +" --- " +num5);

        //需求: 包装类对象 ----> 基本类型.
        int n8 = num2; // 自动拆箱. 包装类对象 ---->  基本类型.
        int n9 = num1.intValue();


        //包装类对象相比基本类型使用好处:
        //  1.包装类对象在使用时,无需手动考虑如何转换类型格式. 参考以上使用介绍.
        //  2.包装工类对象表示的数据形式: 除了1 , 0 以外，还可以表示null。
//        int a = null; 不支持.
//        a = 1;
//        a = 0;

//        Integer b = null;
//        b = 0;
//        b = 1;

    }

}
