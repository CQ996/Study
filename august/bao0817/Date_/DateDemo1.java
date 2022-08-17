package august.bao0817.Date_;


import java.util.Date;

/**
 * @ClassName DateDemo1
 * @Description 使用Date类处理时间（毫秒值转换成对应的日期对象），获取时间的信息
 * @Author CQ
 * @Date 2022/8/17 0:59
 * @Version 1.0
 */
public class DateDemo1 {
    public static void main(String[] args) {
            //Date类记录时间的2种形式
            //形式一：日期对象
        //1.创建一个Date类的对象，代表系统此刻日期时间对象
        Date d=new Date();
        System.out.println(d);
            //形式二：时间毫秒值
        //2.获取时间毫秒值
        long time=d.getTime();
        System.out.println(time);

        //3.将时间毫秒值==>日期对象
        //计算出 当前时间 往后走 1小时121秒 后的时间是多少
        System.out.println("============");
        //(1.)获得当前时间毫秒值
        Date d1=new Date();
        System.out.println(d1);
        //(2.)当前时间往后走1小时121秒
        long time2=System.currentTimeMillis();
        time2+=(60*60+121)*1000;
        //(3.)把时间毫秒值转换成对应的日期对象
        Date d2=new Date(time2);
        System.out.println(d2);

        //也可以用下面写法
        Date d3=new Date();
        d3.setTime(time2);
        System.out.println(d3);

    }
}
