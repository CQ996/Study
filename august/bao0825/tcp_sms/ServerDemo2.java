package august.bao0825.tcp_sms;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ServerDemo2
 * @Description
 * 即时通信-端口转发
 * 1.客户端发送消息
 * 2.客户端随时可以需要收到消息
 * @Author CQ
 * @Date 2022/8/24 14:59
 * @Version 1.0
 */
public class ServerDemo2 {
    //定义一个静态的List集合存储当前全部在线的socket管道
    public static List<Socket> allOnlinesockets=new ArrayList<>();
    public static void main(String[] args) throws Exception {
        System.out.println("=====服务端启动=====");
        //1.注册端口
        ServerSocket serverSocket=new ServerSocket(7777);

        //a.定义一个死循环由主线程负责不断接收客户端的Socket管道连接
        while (true) {
            //2.每接收到一个客户端的Socket管道，交给一个独立的子线程负责读取消息
            Socket socket = serverSocket.accept();
            System.out.println(socket.getRemoteSocketAddress()+"它来了，上线了！");
            allOnlinesockets.add(socket);//上线完成
            //3.开始创建独立线程处理socket
            new Thread(new ServerReaderThread(socket)).start();

        }
    }
}

class ServerReaderThread implements Runnable {
    private Socket socket;
    public ServerReaderThread(Socket socket){
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
                System.out.println(socket.getRemoteSocketAddress()+"说了："+msg);
                //把这个消息进行端口转发给全部客户端socket管道
                sendMsgToAll(msg);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress()+"下线了！");
            ServerDemo2.allOnlinesockets.remove(socket);
        }
    }

    private void sendMsgToAll(String msg) throws Exception {
        for (Socket socket : ServerDemo2.allOnlinesockets) {
            PrintStream ps=new PrintStream(socket.getOutputStream());
            ps.println(msg);
            ps.flush();
        }
    }
}