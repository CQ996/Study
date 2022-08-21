package august.bao0822.bufferedIO.char_buffer;

import java.io.*;

/**
 * @ClassName CharBufferedDome
 * @Description 使用缓冲字符输入流，新增按照行读取readLine()方法
 * @Author CQ
 * @Date 2022/8/22 4:30
 * @Version 1.0
 */
public class BufferedReaderDome1 {
    public static void main(String[] args) {
        try (
                Reader fr = new FileReader("2.txt");
                BufferedReader br=new BufferedReader(fr);
                ){
//            char[] buffer =new char[1024];
//            int len;
//            while ((len=br.read(buffer))!=-1){
//                String rs=new String(buffer,0,len);
//                System.out.println(rs);
//            }

//            System.out.println(br.readLine());//读第一行
//            System.out.println(br.readLine());//读第二行
//            System.out.println(br.readLine());//读第三行
//            System.out.println(br.readLine());//读第四行
//            System.out.println(br.readLine());//没有了读出null
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
