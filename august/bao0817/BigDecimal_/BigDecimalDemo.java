package august.bao0817.BigDecimal_;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @ClassName BigDecimalDemo
 * @Description BigDecimal大数据类的使用
 * @Author CQ
 * @Date 2022/8/17 0:33
 * @Version 1.0
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        //调用BigDecimal方法是最好的使用的方式
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
        //包装浮点型数据为大数据对象
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = a1.add(b1);//a1+b1
        System.out.println(c1);

        BigDecimal c2 = a1.subtract(b1);//a1-b1
        System.out.println(c2);

        BigDecimal c3 = a1.multiply(b1);//a1*b1
        System.out.println(c3);

        BigDecimal c4 = a1.divide(b1);//a1/b1
        System.out.println(c4);

        //再转回double
        double rs = c1.doubleValue();
        System.out.println(rs);

        //注意事项：BigDecimal一定要精度运算，但是有些结果并不能精度运算
        BigDecimal a11 = BigDecimal.valueOf(10.0);
        BigDecimal b11 = BigDecimal.valueOf(3.0);
        //由于除不尽，无法精度运算故而崩溃,
        //指定保留小数位数， RoundingMode.HALF_UP 是四舍五入（也可以是其他舍入模式）
        BigDecimal c11 = a11.divide(b11, 4, RoundingMode.HALF_UP);
        System.out.println(c11);

    }
}
