package august.bao0817.Date_;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName SimpleDateFormat_
 * @Description SimpleDateFormat:格式化日期对象为喜欢的字符串形式
 * @Author CQ
 * @Date 2022/8/17 1:13
 * @Version 1.0
 */
public class SimpleDateFormatDemo01 {
    public static void main(String[] args) {
        //1.日期对象
        Date d = new Date();
        System.out.println(d);

        //2.格式化日期对象(指定格式化形式)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        //3.开始格式化日期对象为喜欢的字符串形式
        String rs = sdf.format(d);
        System.out.println(rs);
        System.out.println("=======121秒后时间========");
        //4.格式化时间毫秒值
        //121秒后时间是多少？
        long time=System.currentTimeMillis()+121*1000;
        String rs2=sdf.format(time);
        System.out.println(rs2);
        System.out.println("解析字符串时间成为日期对象");

    }
}
