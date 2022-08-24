package august.bao0825.socket2;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @ClassName ClientDemo1
 * @Description 完成Socket网络编程入门案例的客户端开发，实现多发多收
 * @Author CQ
 * @Date 2022/8/24 14:48
 * @Version 1.0
 */
public class ClientDemo1 {
    public static void main(String[] args) {
        //1.创建Socket通信管道请求有服务的来连接
        //public Socket(String host,int port)
        //参数一：服务端的IP地址
        //参数二：服务端的端口
        try {
            System.out.println("=====客户端启动=====");
            Socket socket = new Socket("127.0.0.1", 7777);

            //2.从Socket通信管道中得到一个字节输出流，负责发送数据
            OutputStream os = socket.getOutputStream();

            //3.把低级字节流包装成打印流
            PrintStream ps = new PrintStream(os);
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("请输入：");
                String msg = sc.nextLine();
                //4.发送消息
                ps.println(msg);
                ps.flush();
            }


            //关闭资源
            //socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
