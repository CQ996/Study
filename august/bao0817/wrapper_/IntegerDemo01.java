package august.bao0817.wrapper_;

/**
 * @ClassName IntegerDemo01
 * @Description 包装类的功能
 * @Author CQ
 * @Date 2022/8/17 9:44
 * @Version 1.0
 */
public class IntegerDemo01 {
    public static void main(String[] args) {
        int a =10;
        Integer a1=11;
        System.out.println(a);
        System.out.println(a1);
        Integer a2=a;//自动装箱
        System.out.println(a2);
        Integer it=100;
        int it1=it;//自动拆箱
        System.out.println(a2);
        System.out.println(it1);

        Integer age=null;//可以空值
        Integer age1=0;
        //1.包装类可以把基本数据转为字符串类型（没啥用）
        Integer i3=23;
        String rs=i3.toString();
        System.out.println(rs+1);

        String rs1=Integer.toString(i3);
        System.out.println(rs1+1);
        //可以直接加字符串，得到字符串类型
        String rs2=i3+"";
        System.out.println(rs2+1);

        //2.可以把字符串类型数值转为真实的数据类型（很有用）
        int b1=Integer.parseInt("666");//转整数
        int b2=Integer.valueOf(666);
        double d1=Double.parseDouble("666.6");//转小数
        double d2=Double.valueOf("666.6");//转小数
        System.out.println("b1="+b1+",b2="+b2);
        System.out.println("d1="+d1+",d2="+d2);

    }
}
