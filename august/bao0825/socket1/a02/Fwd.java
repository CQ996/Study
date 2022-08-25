package august.bao0825.socket1.a02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName Fwd
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/24 19:25
 * @Version 1.0
 */
public class Fwd {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8800);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String info=null;
        while ((info= br.readLine())!=null){
            System.out.println("我是服务端！客户登录信息为："+info);
        }
        String rel="欢迎你，登录成功！";
        os.write(rel.getBytes());
        os.close();
        is.close();
    }
}
