package august.bao0825.bs_;

import java.io.*;
import java.net.Socket;

/**
 * @ClassName ServerReaderThread
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/24 15:37
 * @Version 1.0
 */
public class ServerReaderRunnable implements Runnable{
    private Socket socket;
    public ServerReaderRunnable(Socket socket){
        this.socket=socket;
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
        } catch (IOException e) {
            System.out.println(socket.getRemoteSocketAddress()+"下线了！");
        }
    }
}
