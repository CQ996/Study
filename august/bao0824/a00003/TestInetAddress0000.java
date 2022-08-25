package august.bao0824.a00003;

import java.net.InetAddress;

/**
 * @ClassName testInetAddress0000
 * @Description java.net.InetAddress
 * public class InetAddress extends Object implements Serivalizble
 * Internet上的主机有两种方式表示地址：
 * 1、域名(hostName)：www.baidu.com
 * 2、IP地址（hostAdress）:14.215.177.39
 * InetAddress类主要表示IP地址
 * InetAddress类对象包含有一个Internet主机地址的域名和IP地址：www.baidu.com和14.215.177.39
 * public class InetAddress getByName(String host)throws UnknownHostException
 * public class InetAddress getLocalhost()throws UnknownHostException找不到主机地址异常
 * @Author CQ
 * @Date 2022/8/24 11:35
 * @Version 1.0
 */
public class TestInetAddress0000 {
    public static void main(String[] args) {

        try {
            InetAddress inetAddress = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress);
            InetAddress inetAddress1 = InetAddress.getByName("14.215.177.38");
            System.out.println(inetAddress1);
            //获取本地地址
            System.out.println(InetAddress.getLocalHost());
            //getHostName()获取当前对象域名
            //getHostAddress()获取当前对象IP地址
            System.out.println(InetAddress.getByName("www.jd.com").getHostName());
            System.out.println(InetAddress.getByName("www.jd.com").getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
