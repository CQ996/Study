package august.bao0825.udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @ClassName DatagramPacket_
 * @Description UDP入门：多发多收
 * @Author CQ
 * @Date 2022/8/24 13:38
 * @Version 1.0
 */
public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("=====服务端启动====");
        //1.创建接收端对象：注册端口（人）
        DatagramSocket socket = new DatagramSocket(8888);
        //2.创建一个数据包对象接收数据
        byte[] buffer = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length);

        while (true) {
            //3.等待接收数据
            socket.receive(packet);

            //4.取出数据
            //读取多少倒多少
            int len = packet.getLength();
            String rs=new String(buffer,0,len);
            System.out.println("收到了来自"+packet.getAddress()+",对方端口是"+packet.getPort()+"的消息"+rs);


        }
    }
}
