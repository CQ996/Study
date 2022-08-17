package august.bao0817.Date_;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @ClassName SimpleDateFormatTest3
 * @Description SimpleDateFormat：限时秒杀案例，先把字符串解析成日期对象再转成毫秒值比较
 * @Author CQ
 * @Date 2022/8/17 1:38
 * @Version 1.0
 */
public class SimpleDateFormatTest3 {
    public static void main(String[] args) throws ParseException {
        //1.开始和结束时间
        String startTime="2021-11-11 00:00:00";
        String endTime="2021-11-11 00:10:00";

        //2.小A 小B 下单时间
        String xa="2021-11-11 00:03:47";
        String xb="2021-11-11 00:10:11";
        //3.解析他们的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1=sdf.parse(startTime);
        Date d2=sdf.parse(endTime);
        Date d3=sdf.parse(xa);
        Date d4=sdf.parse(xb);

        if(d3.after(d1) && d3.before(d2)){//比较毫秒值：测试d3是是否在d1之后。
            System.out.println("小A秒杀成功！");
        }else {
            System.out.println("小A秒杀失败！");
        }
        if(d4.after(d1) && d4.before(d2)){
            System.out.println("小B秒杀成功！");
        }else {
            System.out.println("小B秒杀失败！");
        }
    }
}
