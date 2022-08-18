package august.bao0818;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @ClassName Test4
 * @Description Date与格式化处理演示+Calendar日期类的使用演示
 * @Author CQ
 * @Date 2022/8/18 16:56
 * @Version 1.0
 */
public class Test4 {

    public static void main(String[] args) throws ParseException {

        //Date 类:

        //需求:  如何表示当前日期时间.
        Date d1 = new Date();
        System.out.println( "系统日期时间: " + d1 );
        //Date d2 = Date(long date)  : 将根据毫秒值 --->转换为日期对象.

        //常用功能:
        int year = d1.getYear();
        int month = d1.getMonth();
        int date = d1.getDate();

        int hours = d1.getHours();
        int minutes = d1.getMinutes();
        int seconds = d1.getSeconds();
        System.out.println(  (1900+year)+"-"+(month+1)+"-"+date+" "+hours+":"+minutes+":"+seconds );

        //获取当前时间的毫秒值:  1970~至今.
        long time = d1.getTime();
        System.out.println(time);

        //将当前毫秒值 + 1天 转为日期对象.
        Date d2 = new Date( time+(24*60*60*1000) );
        System.out.println( d2 );


        //格式化日期: DateFormat.
        Date d3 = new Date();

        //创建格式化对象:
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = format.format(d3);
        System.out.println("日期为: " + dateStr);


        //需求: "2021-11-11 11:11:11"  。转换为日期对象计算使用.
        String date1 = "2021-11-11 11:11:11";
        Date d4 = format.parse(date1);
        System.out.println("日期对象为: " + d4);

        //Calendar 类:

        //修改当前系统中的默认时区:
        String[] ids = TimeZone.getAvailableIDs();
        for( String id : ids ){
            System.out.println("可用时区: " + id);
        }

        //调整当前系统的默认时区:
        TimeZone.setDefault(TimeZone.getTimeZone("Canada/Atlantic"));

        //获取当前系统日期时间:
        Calendar now = Calendar.getInstance();
        System.out.println("当前时间: " + now);


        //其他功能:
        now.add( Calendar.DAY_OF_MONTH , -7 );

        now.set(Calendar.DAY_OF_MONTH , 27 );


        //解析日期对象内部日历字段:
        int i = now.get(Calendar.YEAR);
        int i2 = now.get(Calendar.MONTH);
        int i3 = now.get(Calendar.DAY_OF_MONTH);
        int i4 = now.get(Calendar.HOUR_OF_DAY);
        int i5 = now.get(Calendar.MINUTE);
        int i6 = now.get(Calendar.SECOND);

        System.out.println( i+"-"+(i2+1)+"-"+i3+" "+i4+":"+i5+":"+i6 );

        //解析日期对象所属时区:
        TimeZone timeZone = now.getTimeZone();
        System.out.println(timeZone);

        //将一个Date对象----->转为Calendar表示对象结构:
        now.setTime( new Date() );

    }
}
