package august.bao0825.udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @ClassName DatagramPacket_
 * @Description UDP入门：多发多收
 * @Author CQ
 * @Date 2022/8/24 13:38
 * @Version 1.0
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("=====客户端启动====");
        //1.创建发送端对象,发送端自带默认的端口号
        DatagramSocket socket = new DatagramSocket(7777);
        //2.创建一个数据包对象封装数据

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入：");
            String msg=sc.nextLine();
            if("exit".equals(msg)){
                System.out.println("离线成功！");
                socket.close();
                break;
            }
            byte[] buffer=msg.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer,buffer.length,InetAddress.getLocalHost(),8888);
            //3.发送数据出去
            socket.send(packet);
        }





    }
}
