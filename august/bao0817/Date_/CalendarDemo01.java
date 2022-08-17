package august.bao0817.Date_;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName Calendar_
 * @Description Calendar日历抽象类:获取、修改
 * @Author CQ
 * @Date 2022/8/17 1:49
 * @Version 1.0
 */
public class CalendarDemo01 {
    public static void main(String[] args) {
        //1.获取当前日历Calendar对象，调方法获得
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        //2.获取日历信息:public int get(int field),获取日历种的某个字段的信息
        int year=cal.get(Calendar.YEAR);
        System.out.println(year);
        int month=cal.get(Calendar.MONTH)+1;//月份从0开始
        System.out.println(month);
        int date = cal.get(Calendar.DATE);
        System.out.println(date);
        int days = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println("一年中的第"+days+"天");

        //3.修改日历信息：public vold set(int field,int value),修改日历的某个字段信息
        //cal.set(Calendar.HOUR,12);
        //System.out.println(cal);
        //64天59分后是什么时间？
        cal.add(Calendar.DAY_OF_YEAR,64);
        cal.add(Calendar.MINUTE,59);

        //5.public final Date getTime():拿出此刻日期对象
        Date d = cal.getTime();
        System.out.println(d);

        //6.public long getTimeInMills():拿出此刻时间毫秒值
        long time=cal.getTimeInMillis();
        System.out.println(time);

    }
}
