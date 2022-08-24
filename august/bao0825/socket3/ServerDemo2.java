package august.bao0825.socket3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName ServerDemo2
 * @Description 实现服务端可以接收多个客户端的消息
 * @Author CQ
 * @Date 2022/8/24 14:59
 * @Version 1.0
 */
public class ServerDemo2 {
    public static void main(String[] args) {
        //1.注册端口
        try {
            System.out.println("=====服务端启动=====");
            ServerSocket serverSocket=new ServerSocket(7777);
            //a.定义一个死循环由主线程负责不断接收客户端的Socket管道连接
            while (true) {
                //2.每接收到一个客户端的Socket管道，交给一个独立的子线程负责读取消息
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress()+"它来了，上线了！");
                //3.开始创建独立线程处理socket
                new Thread(new ServerReaderThread(socket)).start();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
