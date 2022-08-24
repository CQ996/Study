package august.bao0825.socket2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName ServerDemo2
 * @Description 开发Socket网络编程入门案例的服务端，实现接收消息
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
            //2.调用accpet方法，等待接收客户端的Socket连接请求，建立Socket通信管道
            Socket socket = serverSocket.accept();
            //3.从socket通信管道中得到一个字节输入流
            InputStream is=socket.getInputStream();
            //4.把字节输入流包装成缓冲字符输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            //5.按行读取消息
            String msg;
            while ((msg=br.readLine())!=null){
                System.out.println(socket.getRemoteSocketAddress()+"说了："+msg);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
