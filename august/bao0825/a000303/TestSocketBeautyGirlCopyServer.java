package august.bao0825.a000303;


import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName TestSocketBeautyGirlCopyServer
 * @Description 客户端发送图片给服务端
 * @Author CQ
 * @Date 2022/8/25 10:17
 * @Version 1.0
 */
public class TestSocketBeautyGirlCopyServer {
    public static void main(String[] args) {
        ServerSocket serverSocket=null;
        Socket socket=null;
        InputStream inputStream=null;
        FileOutputStream fileOutputStream=null;
        try {
            serverSocket=new ServerSocket(8888);
            socket=serverSocket.accept();
            inputStream=socket.getInputStream();
            //服务端接收图片地址
            fileOutputStream=new FileOutputStream(new File("C:\\Users\\CQ\\Pictures\\Java\\001.png"));
            byte[] buffer=new byte[1024];
            int len;//记录读取每次读取的字节数
            while ((len=inputStream.read(buffer))!=-1){
                fileOutputStream.write(buffer,0,len);
            }
            System.out.println("接收图片完成了！");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(inputStream!=null){
                    inputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if(socket!=null){
                    socket.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if(fileOutputStream!=null){
                    fileOutputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
