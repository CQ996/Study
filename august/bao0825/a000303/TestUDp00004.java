package august.bao0825.a000303;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @ClassName TestUDp00004
 * @Description UDP发送端
 * @Author CQ
 * @Date 2022/8/25 11:03
 * @Version 1.0
 */
public class TestUDp00004 {
    public static void main(String[] args) {
        System.out.println("=====客户端启动====");
        try (
                //1.创建发送端对象,发送端自带默认的端口号
                DatagramSocket socket = new DatagramSocket();

                ){
            String string="我是UDP发送的短信。";
            byte[] data=string.getBytes();
            InetAddress inetAddress=InetAddress.getLocalHost();
            DatagramPacket packet = new DatagramPacket(data,0,data.length,inetAddress,8888);
            socket.send(packet);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
