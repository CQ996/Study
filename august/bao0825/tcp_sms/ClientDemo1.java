package august.bao0825.tcp_sms;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @ClassName ClientDemo1
 * @Description
 * 即时通信-端口转发
 * 1.客户端发送消息
 * 2.客户端随时可以需要收到消息
 * @Author CQ
 * @Date 2022/8/24 14:48
 * @Version 1.0
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("=====客户端启动=====");
        //1.创建Socket通信管道请求有服务的来连接
        Socket socket = new Socket("127.0.0.1", 7777);
        //创建一个独立的线程专门负责这个客户端的读消息（服务端随时可能转发消息过来！）
        new ClientReaderThread(socket).start();
        //2.从Socket通信管道中得到一个字节输出流，负责发送数据
        OutputStream os = socket.getOutputStream();
        //3.把低级字节流包装成打印流
        PrintStream ps = new PrintStream(os);
        //4.发送消息
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入：");
            String msg = sc.nextLine();
            ps.println(msg);
            ps.flush();
        }
    }
}

class ClientReaderThread extends Thread{
    private Socket socket;
    public ClientReaderThread(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        try {
            //3.从socket通信管道中得到一个字节输入流
            InputStream is=socket.getInputStream();
            //4.把字节输入流包装成缓冲字符输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            //5.按行读取消息
            String msg;
            while ((msg=br.readLine())!=null){
                System.out.println("收到消息"+msg);
            }
        } catch (IOException e) {
            System.out.println("服务端把你踢出去了！");
        }
    }
}