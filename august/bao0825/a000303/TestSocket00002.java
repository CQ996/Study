package august.bao0825.a000303;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @ClassName TestSocket00002
 * @Description
 * 基于Socket实现TCP客户端和服务端的通信
 * 客户端发送信息给服务端，服务端接收信息接收客户端的信息，将信息显示在控制台上
 * 1.创建Socket("host",port)
 * 基于Socket的TCP编程：根据指定服务器的IP地址或端口构造Socket对象，若服务端响应则建立客户端到服务端的通信线路。若连接失败，会出现异常。
 * Java语言的基于套接字（Socket）编程分为服务端和客户端
 * 2.打开连接到Socket的输入/出流。使用getInputStream方式获得输入流、getOutputStream获得输出流，进行数据输入输出
 * 3。按照一定的协议对Socket进行读/写操作，通过输入流读取服务器放入线路的信息。
 *

 * @Author CQ
 * @Date 2022/8/25 8:56
 * @Version 1.0
 */
public class TestSocket00002 {
    public static void main(String[] args) {
        InetAddress inetAddress=null;
        Socket socket=null;
        OutputStream os=null;
        try {
            //客户端：
            //1.创建Socket对象，知名服务端的IP地址和端口号
            inetAddress = InetAddress.getByName("127.0.0.1");
            socket=new Socket(inetAddress,1233);
            //2、获取一个输出流，用于输出数据
            os = socket.getOutputStream();
            //3.写出数据的操作
            os.write("你好，我是客户端！".getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(socket!=null){
                    os.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if(os!=null){
                    os.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
