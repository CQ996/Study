package august.bao0822.bufferedIO.transfer_stream;

import java.io.*;

/**
 * @ClassName CharSetTest00
 * @Description 代码编码和文件编码相同时正常读取
 * @Author CQ
 * @Date 2022/8/22 5:53
 * @Version 1.0
 */
public class CharSetTest00 {
    public static void main(String[] args) {
        try (
                //代码编码和文件编码相同:都是UTF-8，不会乱码
                Reader fr = new FileReader("1.txt");
                BufferedReader br = new BufferedReader(fr)
        ){
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
