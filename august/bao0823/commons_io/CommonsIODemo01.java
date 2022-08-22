package august.bao0823.commons_io;

import sun.misc.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @ClassName CommonsIODemo01
 * @Description 第三方IO包
 * @Author CQ
 * @Date 2022/8/22 16:46
 * @Version 1.0
 */
public class CommonsIODemo01 {
    public static void main(String[] args) throws Exception {
        //1.完成文件的复制
        IOUtils.copy(new FileInputStream("C:\\Users\\CQ\\Pictures\\1.jpg"),
                new FileOutputStream("C:\\Users\\CQ\\Pictures\\9.jpg"));
    }
}
