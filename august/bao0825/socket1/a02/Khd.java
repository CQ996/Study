package august.bao0825.socket1.a02;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName Khd
 * @Description 使用Socket模拟登录
 * @Author CQ
 * @Date 2022/8/24 19:25
 * @Version 1.0
 */
public class Khd {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost",8800);
        OutputStream os = socket.getOutputStream();
        InputStream is = socket.getInputStream();
        String info="用户名：Tom;密码：123456";
        os.write(info.getBytes());
        socket.shutdownOutput();//关闭写入
        String rel=null;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((rel= br.readLine())!=null){
            System.out.println("我是客户端，服务器的响应为："+rel);
        }
        os.close();
        is.close();
    }
}
