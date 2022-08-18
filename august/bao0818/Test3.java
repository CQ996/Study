package august.bao0818;

import java.io.UnsupportedEncodingException;

/**
 * @ClassName Test3
 * @Description String的常用功能演示+StringBuffer与StringBuilder的分析
 * @Author CQ
 * @Date 2022/8/18 15:09
 * @Version 1.0
 */
public class Test3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String a="你好呀，你爱吃水果吗？233333";
        //1.获取字符串长度
        System.out.println(a.length());//17
        //2.获取指定位置上某个字符
        System.out.println(a.charAt(2));//呀
        //3.获取指定字符在字符串中位置
        //返回的是str在字符串中第一次出现的位置
        System.out.println(a.indexOf("你"));//0
        //从fromIndex指定位置开始，获取str在字符串中出现的位置
        System.out.println(a.indexOf("你", 2));//4
        //返回的是str在字符串中最后一次出现的位置
        System.out.println(a.lastIndexOf("你"));//4
        //需求:  构建一个字符串.
        String s1 = "laowang";
        String s2 = new String("laowang");

        //String s3 = new String(byte[] bytes);
        //String s4 = new String(byte[] bytes，int offset , int length );
        //String s5 = new String(byte[] bytes, String charsetName);

        //String s6 = new String(char[] chars);
        char[] chs = { '我' , '请' , '你' };
        String s6 = new String( chs );
        System.out.println( s6 );

        //String s7 = new String(char[] value, int offset, int count)
        char[] chs2 = { '我' , '请' , '你' , '喝' , '水' };
        String s7 = new String( chs2 , 0 , 3 );
        System.out.println( s7 );

        //需求:  常用功能.
        //charAt(int index) concat(String str) contains(CharSequence s)
//        String email = "110@qq.com";
//        char ch1 = email.charAt(0);
//        String newStr = email.concat("-telphone:110");
//        boolean r1 = newStr.contains("telphone");
//        System.out.println( ch1 +" --- " + newStr+" --  "+ r1 );

        //startsWith(String prefix)     endsWith(String suffix) getBytes() getBytes(String charsetName)
//        String email = "email: 110@qq.com";
//        boolean r2 = email.startsWith("email:");
//        boolean r3 = email.endsWith("@qq.com");
//        System.out.println( r2+" --- " + r3 );

        //字符串:  ----> 转字节.(目的: 方便计算机处理. )
//        String msg = "你好";
//        byte[] bytes = msg.getBytes(); //默认: 参考计算机本地的操作系统下语言环境。
//        byte[] bytes2 = msg.getBytes("utf-8"); //手动: 指定某些转换格式.utf-8/gbk/iso-8859-1
//
//        String s3 = new String( bytes );
//        String s4 = new String( bytes2 , "utf-8" );
//        System.out.println(s4);

        //indexOf(int ch) lastIndexOf(int ch) length()
//        String email  = "110@qq.com";
        //查找元素的位置: 找到返回,否则-1.
//        int index1 = email.indexOf('@');
//        int index2 = email.lastIndexOf('@');
//        System.out.println( index1 );
//        System.out.println( index2 );
//        System.out.println( email.length() );


        //replace(char oldChar, char newChar)
//        String email  = "110@qq.com";
//        String newStr = email.replace('1', '2');
//        String newStr3 = newStr.replace("qq.com", "163.com");
//        System.out.println( newStr3 );

        //split(String regex)   substring(int beginIndex)   substring(int beginIndex, int endIndex)
        String msg = "1-小明-18-男生-addr:合肥市-qq:110";
        String[] strs = msg.split("-");
        System.out.println( strs.length );

        //提取地址:
        int index = msg.indexOf(':');
        String str1 = msg.substring(index + 1);
        System.out.println("提取内容为: " + str1);
        String str2 = msg.substring( (index + 1) , (index + 1+3) ); //包含起始位置,不含结尾位置.
        System.out.println("提取内容为: " + str2);

        //toCharArray() toLowerCase() toUpperCase() trim() valueOf(boolean b)
        String info = "  qq: 110   ";
        char[] chs3 = info.toCharArray();
        String info1 = info.toLowerCase();
        String info2 = info.toUpperCase();
        System.out.println(info1+ " ---- " + info2);
        String info3 = info.trim();
        System.out.println( info +" --- " + info3);

        int a2 = 10;
        System.out.println(String.valueOf(a2));


        // StringBuffer 线程同步, StringBuilder 线程不同步   相同点: 两者都是可变字符序列.
        String stu1 = "1-小明";
        StringBuffer sb1 = new StringBuffer( stu1 );
        sb1.append( "2-小花" );
        sb1.append( "3-小花" );
        sb1.append( "4-小花" );
        sb1.append( "5-小花" );

        StringBuilder sb2 = new StringBuilder( stu1 );
        sb2.append( "2-小花" );
        sb2.append( "3-小花" );
        sb2.append( "4-小花" );
        sb2.append( "5-小花" );

        System.out.println( sb1 +" --- " + sb2 );

        //String , StringBuffer , StringBuilder : 小结区别.

    }
}
