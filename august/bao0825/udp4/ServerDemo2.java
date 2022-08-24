package august.bao0825.udp4;

import java.net.*;

/**
 * @ClassName DatagramPacket_
 * @Description UDP组播
 * @Author CQ
 * @Date 2022/8/24 13:38
 * @Version 1.0
 */
public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("=====服务端启动====");
        //1.创建接收端对象：注册端口（人）
        MulticastSocket socket = new MulticastSocket(9999);

        //把当前接收端加入到一个组播组中去，绑定对应的组播消息的组播IP
        //socket.joinGroup(InetAddress.getByName("224.0.0.1"));
        socket.joinGroup(new InetSocketAddress(InetAddress.getByName("224.0.0.1"),9999),NetworkInterface.getByInetAddress(InetAddress.getLocalHost()));

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
