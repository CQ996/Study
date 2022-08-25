package august.bao0825.a000303;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @ClassName TestSocketBeautyGirlCopyServer
 * @Description 客户端发送图片给服务端
 * @Author CQ
 * @Date 2022/8/25 10:17
 * @Version 1.0
 */
public class TestSocketBeautyGirlCopyClient {
    public static void main(String[] args) {
        Socket socket=null;
        OutputStream outputStream=null;
        FileInputStream fileInputStream=null;
        try {
            socket=new Socket(InetAddress.getByName("127.0.0.1"),8888);
            outputStream=socket.getOutputStream();
            //客户端发送的图片地址
            fileInputStream=new FileInputStream(new File("C:\\Users\\CQ\\Pictures\\1.jpg"));
            byte[] buffer=new byte[1024];
            int len;//记录读取每次读取的字节数
            while ((len=fileInputStream.read(buffer))!=-1){
                outputStream.write(buffer,0,len);
            }
            System.out.println("图片发送完成了！");

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(socket!=null){
                    socket.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if(outputStream!=null){
                    outputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if(fileInputStream!=null){
                    fileInputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
