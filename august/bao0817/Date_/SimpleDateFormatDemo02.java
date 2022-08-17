package august.bao0817.Date_;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName SimpleDateFormatDemo02
 * @Description SimpleDateFormat:解析字符串时间成为日期对象
 * @Author CQ
 * @Date 2022/8/17 1:24
 * @Version 1.0
 */
public class SimpleDateFormatDemo02 {
    public static void main(String[] args) throws ParseException {
        //2021年08月06日 11:11:11 往后2天14小时49分06秒后的时间是多少
        //1.把字符串时间拿到程序中来
        String dateStr = "2021年08月06日 11:11:11";
        //2.把字符串时间解析成日期对象:形式必须与被解析时间的形式完全一样，否则解析会BUG
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
       // 解析文本字符串以产生 Date。
        Date d = sdf.parse(dateStr);
        //3.往后走2天14小时49分06秒,加L以long形运算防止超出int计算范围
        long time = d.getTime() + (2L * 24 * 60 * 60 + 14 * 60 * 60 + 49 * 60 + 6) * 1000;
        //4.格式化时间毫秒值
        System.out.println(sdf.format(time));
    }
}
