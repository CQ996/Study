package august.bao0825.bs_;


import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * @ClassName BSserverDemo
 * @Description BS架构模拟网页通信
 * @Author CQ
 * @Date 2022/8/24 17:18
 * @Version 1.0
 */
public class BSserverDemo {
    //使用静态变量记住一个线程池对象
    private static ExecutorService pool=new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2),
            Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        try {
            //1.注册端口
            //192.168.102.25
            ServerSocket ss= new ServerSocket();

            ss.bind(new InetSocketAddress("127.0.0.1",6666));
            //ServerSocket ss=new ServerSocket(12333,10, InetAddress.getByName ("192.168.102.25"));
            //ServerSocket ss=new ServerSocket(8080);
            //2.定义一个循环由接收多个客户端的请求
            while (true) {
                //3.每接收到一个客户端的Socket管道，交给一个独立的子线程负责读取消息
                Socket socket = ss.accept();
                //
                pool.execute(new ServerReaderRunnable(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*

class ServerReaderThread extends Thread {
    private Socket socket;

    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //浏览器已经与本线程建立了Socket管道
            //响应消息给浏览器显示
            PrintStream ps=new PrintStream(socket.getOutputStream());
            //必须响应HTTP协议格式数据，否则浏览器不认识消息
            ps.println("HTTP/1.1 200 OK");//协议类型和版本 响应成功的消息
            ps.println("Content-Type:text/html;charset=UTF-8");//响应头部的数据类型：文本/网页，编码utf-8
            ps.println();//协议格式要求必须发送一个空行
            //才可以响应数据回去给浏览器
            ps.println("<span style='color:red;font-size:90px'>(响应正文:凯子、胡子你们好呀)</span>");
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

*/
