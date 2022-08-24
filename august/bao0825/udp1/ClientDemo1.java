package august.bao0825.udp1;

import bao0711.Date;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName DatagramPacket_
 * @Description UDP入门——发送端:一发一收
 * @Author CQ
 * @Date 2022/8/24 13:38
 * @Version 1.0
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("=====客户端启动====");
        //1.创建发送端对象,发送端自带默认的端口号
        DatagramSocket socket = new DatagramSocket(6666);
        //2.创建一个数据包对象封装数据
/*
        public DatagramPacket(byte buf[], int length,
        InetAddress address, int port)
        参数一：封装要发送的数据
        参数二：发送数据的大小
        参数三：对方（服务端）的IP地址
        参数四：对方（服务端）的端口

*/
        byte[] buffer="我是一棵快乐的韭菜".getBytes();
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length,InetAddress.getLocalHost(),8888);
        //3.发送数据出去
        socket.send(packet);
        socket.close();

    }
}
