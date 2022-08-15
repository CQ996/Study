package august.bao0804;

/**
 * @ClassName StringDouble
 * @Description 字符串和小数混合数据中截取出小数，再字符串转小数
 * @Author CQ
 * @Date 2022/8/4 14:01
 * @Version 1.0
 */
public class StringDouble {
    public static void main(String[] args) {
        String name="张三 1.89";
        int index=name.indexOf(" ");
        String a=name.substring(0,index);
        //转换成double类型
        double b=Double.parseDouble(name.substring(index+1));
        System.out.println(b*2);
    }


}
