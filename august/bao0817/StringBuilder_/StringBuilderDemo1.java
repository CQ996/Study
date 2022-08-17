package august.bao0817.StringBuilder_;

/**
 * @ClassName StringBuilderDemo1
 * @Description 使用StringBuilder来操作字符串
 * @Author CQ
 * @Date 2022/8/16 22:54
 * @Version 1.0
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append(false);
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder();
        //支持链式编程
        sb1.append("a").append("b").append("c");
        System.out.println(sb1);

        //反转内容
        sb1.reverse().append("100");
        System.out.println(sb1);
        System.out.println(sb1.length());
        //StringBuilder只是拼接字符串的手段
        //最后结果还是要恢复成String类型
        String str=sb1.toString();
        System.out.println(str);
    }

}
