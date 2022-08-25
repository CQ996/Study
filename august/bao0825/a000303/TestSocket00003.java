package august.bao0825.a000303;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName TestSocket00003
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/25 9:21
 * @Version 1.0
 */
public class TestSocket00003 {
    public static void main(String[] args) {
        ServerSocket ss=null;
        Socket socket=null;
        InputStream is =null;
        ByteArrayOutputStream baos =null;
        InetAddress inetAddress=null;

        try {
            inetAddress=InetAddress.getByName("127.0.0.1");
            //1.创建服务器端的ServerSocket,指定自己的端口号
            ss=new ServerSocket(1233,10,inetAddress);
            //2.调用accept()表示接收来自客户端的Socket
            socket=ss.accept();
            //3.获取输入流
            is = socket.getInputStream();
            //4.读取输入流中的数据
            baos = new ByteArrayOutputStream();
            byte[] buffer=new byte[5];
            int length;
            while ((length=is.read(buffer))!=-1){
                baos.write(buffer,0,length);
            }
            System.out.println("接收到了来自"+socket.getInetAddress().getHostAddress()+"的数据："+baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(baos!=null){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(ss!=null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
